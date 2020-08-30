package RemoveDirectory;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveDirectory
{
	int descent = 0;


	boolean removeDirectory(String directoryPath)
	{
		File currentDirectory = new File(directoryPath);
		PrintWriter pw = new PrintWriter(System.out, true);
		PrintWriter pe = new PrintWriter(System.err, true);

		if(!currentDirectory.exists())
		{
			pe.println("[FAIL] Descent: " + descent + " No such file or directory: " + currentDirectory.getAbsolutePath());
			return false;
		}

		descent++;


		File[] fileList = currentDirectory.listFiles();

		for(File f : fileList)
		{
			if(f.isFile())
			{
				if(f.delete())
				{
					pw.println("[PASS] Descent: " + descent + " File: " + f.getAbsolutePath() + " successfully removed");
				}

				else
				{
					pe.println("[FAIL] Descent: " + descent + " Unable to delete the File: " + f.getAbsolutePath());
				}
			}

			else if(f.isDirectory())
			{
				removeDirectory(f.getAbsolutePath());
			}
		}

		//try deleting the folder once all inner files and folders are removed
		descent--;
		if(currentDirectory.delete())
		{
			pw.println("[PASS] Descent: " + descent + " Directory: " + currentDirectory.getAbsolutePath() + " successfully removed");
			return true;
		}

		else
		{
			pe.println("[FAIL] Descent: " + descent + " Unable to delete the Directory: " + currentDirectory.getAbsolutePath());
			return false;
		}
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out, true);

		pw.println("Enter the directory to be deleted");

		RemoveDirectory rw = new RemoveDirectory();

		if(rw.removeDirectory(sc.nextLine()))
		{
			pw.println("[PASS] Operation successfully completed");
		}
	}
}


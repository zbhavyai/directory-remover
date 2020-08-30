## Java Directory Remover
A simple Java program to recursively remove the file and/or directory that is supplied as input
<br/>
<br/>

### Features
+ Shows the files and directories that are being removed
+ Shows the working depth/descent the removing file is
+ Clearly mentions PASS/FAIL message for each operation (lol)
<br/>
<br/>

### Usage

1. The program can be fired using simple java compile and run
    ```
    javac RemoveDirectory/RemoveDirectory.java
    java RemoveDirectory.RemoveDirectory
    ```


1. Wrapper scripts for Linux and Windows are also provided
    For linux,
    ```
    chmod +x RemoveDirectory.sh
    ./RemoveDirectory.sh
    ```

    For windows,
    ```
    RemoveDirectory.cmd
    ```

1. During execution, input the file/directory name, either absolute or relative from location of the program
    ```
    ./tput-colors.sh
    ```

1. The program shall not handle the permissions, and may not remove files/directories if the user don't have deletion access. To remove such files/directories, run the program using apt permissions.


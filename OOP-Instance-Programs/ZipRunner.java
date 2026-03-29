class ZipRunner {
    public static void main(String[] args) {

        // Main object
        Zip mainZip = new Zip();

        System.out.println("\n--- Before Reassigning ---\n");
        System.out.println("Type   : " + mainZip.type);
        System.out.println("Size   : " + mainZip.size);
        System.out.println("Encrypt: " + mainZip.isEncrypted);
        System.out.println("Ratio  : " + mainZip.ratio);
        System.out.println("Format : " + mainZip.format);

        // Reassign values
        mainZip.type = "Secure";
        mainZip.size = 200;
        mainZip.isEncrypted = true;
        mainZip.ratio = 3.0;
        mainZip.format = ".rar";

        System.out.println("\n--- After Reassigning ---\n");
        System.out.println("Type   : " + mainZip.type);
        System.out.println("Size   : " + mainZip.size);
        System.out.println("Encrypt: " + mainZip.isEncrypted);
        System.out.println("Ratio  : " + mainZip.ratio);
        System.out.println("Format : " + mainZip.format);

        // Creating 10 objects
        Zip projectZip = new Zip();
        Zip backupZip = new Zip();
        Zip mediaZip = new Zip();
        Zip gameZip = new Zip();
        Zip docZip = new Zip();
        Zip secureZip = new Zip();
        Zip archiveZip = new Zip();
        Zip cloudZip = new Zip();
        Zip systemZip = new Zip();
        Zip tempZip = new Zip();

        // ---------------- DEFAULT VALUES ----------------
        System.out.println("\n--- Default Values ---\n");

        System.out.println("Project Zip Creator: " + projectZip.creator);
        System.out.println("Backup Zip Creator : " + backupZip.creator);
        System.out.println("Media Zip Creator  : " + mediaZip.creator);
        System.out.println("Game Zip Creator   : " + gameZip.creator);
        System.out.println("Doc Zip Creator    : " + docZip.creator);
        System.out.println("Secure Zip Creator : " + secureZip.creator);
        System.out.println("Archive Zip Creator: " + archiveZip.creator);
        System.out.println("Cloud Zip Creator  : " + cloudZip.creator);
        System.out.println("System Zip Creator : " + systemZip.creator);
        System.out.println("Temp Zip Creator   : " + tempZip.creator);

        // ---------------- ASSIGN VALUES ----------------

        projectZip.fileName = "project.zip";
        projectZip.compressedSize = 50;
        projectZip.method = "LZ";
        projectZip.filesCount = 10;
        projectZip.password = "123";
        projectZip.platform = "Windows";
        projectZip.isSplit = false;
        projectZip.creator = "Bakkesh";
        projectZip.version = "1.0";
        projectZip.status = "Active";

        backupZip.fileName = "backup.zip";
        backupZip.compressedSize = 80;
        backupZip.method = "RAR";
        backupZip.filesCount = 20;
        backupZip.password = "abc";
        backupZip.platform = "Linux";
        backupZip.isSplit = true;
        backupZip.creator = "Rahul";
        backupZip.version = "2.0";
        backupZip.status = "Stored";

        mediaZip.fileName = "media.zip";
        mediaZip.compressedSize = 120;
        mediaZip.method = "ZIP";
        mediaZip.filesCount = 30;
        mediaZip.password = "media";
        mediaZip.platform = "Windows";
        mediaZip.isSplit = false;
        mediaZip.creator = "Kiran";
        mediaZip.version = "1.5";
        mediaZip.status = "Active";

        gameZip.fileName = "game.zip";
        gameZip.compressedSize = 300;
        gameZip.method = "7z";
        gameZip.filesCount = 50;
        gameZip.password = "game";
        gameZip.platform = "Windows";
        gameZip.isSplit = true;
        gameZip.creator = "Arjun";
        gameZip.version = "3.0";
        gameZip.status = "Installed";

        docZip.fileName = "docs.zip";
        docZip.compressedSize = 40;
        docZip.method = "ZIP";
        docZip.filesCount = 15;
        docZip.password = "doc";
        docZip.platform = "Mac";
        docZip.isSplit = false;
        docZip.creator = "Priya";
        docZip.version = "1.1";
        docZip.status = "Active";

        secureZip.fileName = "secure.zip";
        secureZip.compressedSize = 60;
        secureZip.method = "AES";
        secureZip.filesCount = 12;
        secureZip.password = "secure";
        secureZip.platform = "Linux";
        secureZip.isSplit = false;
        secureZip.creator = "Meena";
        secureZip.version = "2.1";
        secureZip.status = "Encrypted";

        archiveZip.fileName = "archive.zip";
        archiveZip.compressedSize = 200;
        archiveZip.method = "RAR";
        archiveZip.filesCount = 70;
        archiveZip.password = "arch";
        archiveZip.platform = "Windows";
        archiveZip.isSplit = true;
        archiveZip.creator = "Suresh";
        archiveZip.version = "4.0";
        archiveZip.status = "Archived";

        cloudZip.fileName = "cloud.zip";
        cloudZip.compressedSize = 90;
        cloudZip.method = "ZIP";
        cloudZip.filesCount = 25;
        cloudZip.password = "cloud";
        cloudZip.platform = "Cloud";
        cloudZip.isSplit = false;
        cloudZip.creator = "Divya";
        cloudZip.version = "2.5";
        cloudZip.status = "Synced";

        systemZip.fileName = "system.zip";
        systemZip.compressedSize = 150;
        systemZip.method = "7z";
        systemZip.filesCount = 35;
        systemZip.password = "sys";
        systemZip.platform = "Windows";
        systemZip.isSplit = false;
        systemZip.creator = "Ravi";
        systemZip.version = "3.2";
        systemZip.status = "System";

        tempZip.fileName = "temp.zip";
        tempZip.compressedSize = 20;
        tempZip.method = "ZIP";
        tempZip.filesCount = 5;
        tempZip.password = "temp";
        tempZip.platform = "Windows";
        tempZip.isSplit = false;
        tempZip.creator = "Anil";
        tempZip.version = "1.0";
        tempZip.status = "Temporary";

        // ---------------- PRINT ALL VALUES ----------------
        System.out.println("\n--- After Assigning Values ---\n");

        // Example: Project Zip
        System.out.println("Project Zip:");
        System.out.println("File Name    : " + projectZip.fileName);
        System.out.println("Size         : " + projectZip.compressedSize);
        System.out.println("Method       : " + projectZip.method);
        System.out.println("Files Count  : " + projectZip.filesCount);
        System.out.println("Password     : " + projectZip.password);
        System.out.println("Platform     : " + projectZip.platform);
        System.out.println("Split        : " + projectZip.isSplit);
        System.out.println("Creator      : " + projectZip.creator);
        System.out.println("Version      : " + projectZip.version);
        System.out.println("Status       : " + projectZip.status);
        System.out.println("-----------------------------");

        // Backup Zip

        System.out.println("Backup Zip:");
        System.out.println("File Name    : " + backupZip.fileName);
        System.out.println("Size         : " + backupZip.compressedSize);
        System.out.println("Method       : " + backupZip.method);
        System.out.println("Files Count  : " + backupZip.filesCount);
        System.out.println("Password     : " + backupZip.password);
        System.out.println("Platform     : " + backupZip.platform);
        System.out.println("Split        : " + backupZip.isSplit);
        System.out.println("Creator      : " + backupZip.creator);
        System.out.println("Version      : " + backupZip.version);
        System.out.println("Status       : " + backupZip.status);
        System.out.println("-----------------------------");

        System.out.println("Media Zip:");
        System.out.println("File Name    : " + mediaZip.fileName);
        System.out.println("Size         : " + mediaZip.compressedSize);
        System.out.println("Method       : " + mediaZip.method);
        System.out.println("Files Count  : " + mediaZip.filesCount);
        System.out.println("Password     : " + mediaZip.password);
        System.out.println("Platform     : " + mediaZip.platform);
        System.out.println("Split        : " + mediaZip.isSplit);
        System.out.println("Creator      : " + mediaZip.creator);
        System.out.println("Version      : " + mediaZip.version);
        System.out.println("Status       : " + mediaZip.status);
        System.out.println("-----------------------------");

        // Game Zip
        System.out.println("Game Zip:");
        System.out.println("File Name    : " + gameZip.fileName);
        System.out.println("Size         : " + gameZip.compressedSize);
        System.out.println("Method       : " + gameZip.method);
        System.out.println("Files Count  : " + gameZip.filesCount);
        System.out.println("Password     : " + gameZip.password);
        System.out.println("Platform     : " + gameZip.platform);
        System.out.println("Split        : " + gameZip.isSplit);
        System.out.println("Creator      : " + gameZip.creator);
        System.out.println("Version      : " + gameZip.version);
        System.out.println("Status       : " + gameZip.status);
        System.out.println("-----------------------------");

        // Doc Zip
        System.out.println("Doc Zip:");
        System.out.println("File Name    : " + docZip.fileName);
        System.out.println("Size         : " + docZip.compressedSize);
        System.out.println("Method       : " + docZip.method);
        System.out.println("Files Count  : " + docZip.filesCount);
        System.out.println("Password     : " + docZip.password);
        System.out.println("Platform     : " + docZip.platform);
        System.out.println("Split        : " + docZip.isSplit);
        System.out.println("Creator      : " + docZip.creator);
        System.out.println("Version      : " + docZip.version);
        System.out.println("Status       : " + docZip.status);
        System.out.println("-----------------------------");

        // Secure Zip
        System.out.println("Secure Zip:");
        System.out.println("File Name    : " + secureZip.fileName);
        System.out.println("Size         : " + secureZip.compressedSize);
        System.out.println("Method       : " + secureZip.method);
        System.out.println("Files Count  : " + secureZip.filesCount);
        System.out.println("Password     : " + secureZip.password);
        System.out.println("Platform     : " + secureZip.platform);
        System.out.println("Split        : " + secureZip.isSplit);
        System.out.println("Creator      : " + secureZip.creator);
        System.out.println("Version      : " + secureZip.version);
        System.out.println("Status       : " + secureZip.status);
        System.out.println("-----------------------------");

        // Archive Zip
        System.out.println("Archive Zip:");
        System.out.println("File Name    : " + archiveZip.fileName);
        System.out.println("Size         : " + archiveZip.compressedSize);
        System.out.println("Method       : " + archiveZip.method);
        System.out.println("Files Count  : " + archiveZip.filesCount);
        System.out.println("Password     : " + archiveZip.password);
        System.out.println("Platform     : " + archiveZip.platform);
        System.out.println("Split        : " + archiveZip.isSplit);
        System.out.println("Creator      : " + archiveZip.creator);
        System.out.println("Version      : " + archiveZip.version);
        System.out.println("Status       : " + archiveZip.status);
        System.out.println("-----------------------------");

        // Cloud Zip
        System.out.println("Cloud Zip:");
        System.out.println("File Name    : " + cloudZip.fileName);
        System.out.println("Size         : " + cloudZip.compressedSize);
        System.out.println("Method       : " + cloudZip.method);
        System.out.println("Files Count  : " + cloudZip.filesCount);
        System.out.println("Password     : " + cloudZip.password);
        System.out.println("Platform     : " + cloudZip.platform);
        System.out.println("Split        : " + cloudZip.isSplit);
        System.out.println("Creator      : " + cloudZip.creator);
        System.out.println("Version      : " + cloudZip.version);
        System.out.println("Status       : " + cloudZip.status);
        System.out.println("-----------------------------");

        // System Zip
        System.out.println("System Zip:");
        System.out.println("File Name    : " + systemZip.fileName);
        System.out.println("Size         : " + systemZip.compressedSize);
        System.out.println("Method       : " + systemZip.method);
        System.out.println("Files Count  : " + systemZip.filesCount);
        System.out.println("Password     : " + systemZip.password);
        System.out.println("Platform     : " + systemZip.platform);
        System.out.println("Split        : " + systemZip.isSplit);
        System.out.println("Creator      : " + systemZip.creator);
        System.out.println("Version      : " + systemZip.version);
        System.out.println("Status       : " + systemZip.status);
        System.out.println("-----------------------------");

        // Temp Zip
        System.out.println("Temp Zip:");
        System.out.println("File Name    : " + tempZip.fileName);
        System.out.println("Size         : " + tempZip.compressedSize);
        System.out.println("Method       : " + tempZip.method);
        System.out.println("Files Count  : " + tempZip.filesCount);
        System.out.println("Password     : " + tempZip.password);
        System.out.println("Platform     : " + tempZip.platform);
        System.out.println("Split        : " + tempZip.isSplit);
        System.out.println("Creator      : " + tempZip.creator);
        System.out.println("Version      : " + tempZip.version);
        System.out.println("Status       : " + tempZip.status);
        System.out.println("-----------------------------");
    }
}
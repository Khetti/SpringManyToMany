package com.example.codeclan.fileservice.components;

import com.example.codeclan.fileservice.models.File;
import com.example.codeclan.fileservice.models.Folder;
import com.example.codeclan.fileservice.repositories.FileRepository;
import com.example.codeclan.fileservice.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private FolderRepository folderRepository;

    @Autowired
    private FileRepository fileRepository;

    @Override
    public void run(ApplicationArguments args) {

        Folder documents = new Folder("Documents");
        folderRepository.save(documents);
        Folder codeClan = new Folder("CodeClan");
        folderRepository.save(codeClan);
        Folder games = new Folder("Games");
        folderRepository.save(games);
        File notes = new File("Notes", ".txt", 50, documents);
        fileRepository.save(notes);
        File accounts = new File("Accounts", ".xlsm", 40000, documents);
        fileRepository.save(accounts);
        File project = new File("Project", ".java", 1500, codeClan);
        fileRepository.save(project);
        File homework = new File("Homework", ".rb", 500, codeClan);
        fileRepository.save(homework);
        File worldOfWarcraft = new File("World of Warcraft", ".exe", 80000000, games);
        fileRepository.save(worldOfWarcraft);
        File videoDriver = new File("Video Card Driver", ".dll", 120000, games);
        fileRepository.save(videoDriver);

    }

}

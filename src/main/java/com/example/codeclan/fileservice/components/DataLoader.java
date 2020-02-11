package com.example.codeclan.fileservice.components;

import com.example.codeclan.fileservice.models.File;
import com.example.codeclan.fileservice.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private FileRepository fileRepository;

    @Override
    public void run(ApplicationArguments args) {

        File notes = new File("Notes", ".txt", 50);
        fileRepository.save(notes);
        File accounts = new File("Accounts", ".xlsm", 40000);
        fileRepository.save(accounts);
        File project = new File("Project", ".java", 1500);
        fileRepository.save(project);
        File homework = new File("Homework", ".rb", 500);
        fileRepository.save(homework);
        File worldOfWarcraft = new File("World of Warcraft", ".exe", 80000000);
        fileRepository.save(worldOfWarcraft);
        File videoDriver = new File("Video Card Driver", ".dll", 120000);
        fileRepository.save(videoDriver);

    }

}

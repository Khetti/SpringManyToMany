package com.example.codeclan.fileservice;

import com.example.codeclan.fileservice.models.File;
import com.example.codeclan.fileservice.models.Folder;
import com.example.codeclan.fileservice.repositories.FileRepository;
import com.example.codeclan.fileservice.repositories.FolderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FileserviceApplicationTests {

	@Autowired
	private FolderRepository folderRepository;

	@Autowired
	private FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateAndSaveObjects() {
		Folder folder = new Folder("CodeClan");
		folderRepository.save(folder);

		File file = new File("Notes", ".txt", 50, folder);
		fileRepository.save(file);
	}

}

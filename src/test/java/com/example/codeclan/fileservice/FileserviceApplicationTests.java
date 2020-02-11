package com.example.codeclan.fileservice;

import com.example.codeclan.fileservice.models.File;
import com.example.codeclan.fileservice.models.Folder;
import com.example.codeclan.fileservice.models.User;
import com.example.codeclan.fileservice.repositories.FileRepository;
import com.example.codeclan.fileservice.repositories.FolderRepository;
import com.example.codeclan.fileservice.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FileserviceApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private FolderRepository folderRepository;

	@Autowired
	private FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateAndSaveObjects() {
		User user = new User("Greg");
		userRepository.save(user);

		Folder folder = new Folder("CodeClan", user);
		folderRepository.save(folder);

		File file = new File("Notes", ".txt", 50, folder);
		fileRepository.save(file);
	}

}

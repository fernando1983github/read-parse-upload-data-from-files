package test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.io.FilenameUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.personal.data.upload.bo.LoadRepoBo;
import com.personal.data.upload.config.ApplicationConfiguration;
import com.personal.data.upload.loader.ExcelRepository;
import com.personal.data.upload.loader.ItemsRepository;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/applicationContext-test.xml"})
public class TestOne {
	@Autowired
	LoadRepoBo loadRepoBo;
	
	ItemsRepository excelRepo;
	
	@Before
	public void before() throws Exception {
		String pathfile = "C:\\Pruebas\\Financial Sample.xlsx";
		File file = new File(pathfile);
		byte[] bytes = null;
		bytes = Files.readAllBytes(Paths.get(file.getAbsolutePath()));
		ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
		String extension = FilenameUtils.getExtension(file.getName());
		excelRepo = new ExcelRepository(bais, extension);
	}
	
	@Test
	public void dataFromFileMustBePersisted() throws Exception {
		loadRepoBo.loadRepo(excelRepo);
	}
	
	@Test
	public void propertiesMustBeRead() {
		System.out.println(ApplicationConfiguration.ENVIRONMENT);
	}
}

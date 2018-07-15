package com.atguigu;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.atguigu.bean.Article;

import io.searchbox.client.JestClient;
import io.searchbox.core.Index;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot03ElasticApplicationTests {

	@Autowired
	private JestClient jestClient;

	@Test
	public void contextLoads() {
		Article article = new Article(2, "ypvoid1", "elastic22search", "article22333 content");
		Index index = new Index.Builder(article).index("atguigu").type("article").build();

		try {
			jestClient.execute(index);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

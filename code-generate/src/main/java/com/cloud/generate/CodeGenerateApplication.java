package com.cloud.generate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 文件中心
 * 
 * @author 小威老师 xiaoweijiagou@163.com
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CodeGenerateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeGenerateApplication.class, args);
	}

}
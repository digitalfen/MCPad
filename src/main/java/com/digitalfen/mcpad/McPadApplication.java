package com.digitalfen.mcpad;

import java.util.List;

import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.digitalfen.mcpad.service.MCPadService;

@SpringBootApplication
public class McPadApplication {

	public static void main(String[] args) {
		SpringApplication.run(McPadApplication.class, args);
	}

	@Bean
	public List<ToolCallback> mcpadTools(MCPadService mcpadService) {
		return List.of(ToolCallbacks.from(mcpadService));
	}

}

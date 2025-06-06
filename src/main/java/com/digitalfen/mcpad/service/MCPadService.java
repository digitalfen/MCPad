package com.digitalfen.mcpad.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class MCPadService {

    @Tool(name = "test", description = "A test tool for demonstration purposes")
    public String test() {
        String message = "";

        return "Test tool executed successfully! - " + message;

    }

}
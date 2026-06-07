package com.tyler.sentinel.service;

import org.springframework.stereotype.Service;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.models.ChatModel;
import com.openai.models.chat.completions.ChatCompletion;
import com.openai.models.chat.completions.ChatCompletionCreateParams;

@Service
public class AIService {

    private final OpenAIClient client;

    public AIService() {
        this.client = OpenAIOkHttpClient.fromEnv();
    }

    public String explainFinding(String finding) {

        // Call OpenAI here

        return "";
    }
}

/*
 * Copyright (c) Ronnyz. 2023-2023. All rights reserved.
 */

package cn.bugstack.chatbot.api.domain.ai.model.vo;

/**
 * Message
 *
 * @author Ronnyz
 * @since 2023/9/30
 */
public class Message {
    private String content;
    private String role;

    public Message(String role, String content) {
        this.content = content;
        this.role = role;
    }

    public String getContent() { return content; }
    public void setContent(String value) { this.content = value; }

    public String getRole() { return role; }
    public void setRole(String value) { this.role = value; }
}

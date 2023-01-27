package cn.bugstack.chatbot.api.domain.ai;

import java.io.IOException;

/**
 * @author 小傅哥，微信：fustack
 * @description ChatGPT open ai 接口：https://beta.openai.com/account/api-keys
 * @github https://github.com/fuzhengwei
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface IOpenAI {

    String doChatGPT(String openAiKey, String question) throws IOException;

}

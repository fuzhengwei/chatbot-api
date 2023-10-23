package cn.bugstack.chatbot.api.domain.ai.model.aggregates;

import cn.bugstack.chatbot.api.domain.ai.model.vo.CompletionModel;
import cn.bugstack.chatbot.api.domain.ai.model.vo.Message;

/**
 * AI Question
 *
 * @author Ronnyz
 * @since 2023/9/30
 */
public class AIQuestion {
    private CompletionModel completion;

    public AIQuestion(CompletionModel completion) {
        this.completion = completion;
    }

    public AIQuestion(String model, String content) {
        Message systemMsg = new Message("system", "你是一位 AI 咨询师，你的计算机技术能力超强，能够为我提供准确的解答和建议，无论我的问题是生活问题、编程问题还是其他领域的问题，你都能够提供详尽的解释和回答。");
        Message userMsg = new Message("user", content);
        Message[] msgs = new Message[2];
        msgs[0] = systemMsg;
        msgs[1] = userMsg;

        this.completion = new CompletionModel(model, msgs);
    }

    public CompletionModel getCompletion() {
        return completion;
    }

    public void setCompletion(CompletionModel completion) {
        this.completion = completion;
    }
}

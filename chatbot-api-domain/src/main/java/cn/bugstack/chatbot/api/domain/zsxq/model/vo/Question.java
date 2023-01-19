package cn.bugstack.chatbot.api.domain.zsxq.model.vo;

/**
 * @author 小傅哥，微信：fustack
 * @description
 * @github https://github.com/fuzhengwei
 * @copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class Question {

    private Owner owner;

    private Questionee questionee;

    private String text;

    private boolean expired;

    private boolean anonymous;

    private OwnerDetail owner_detail;

    private String owner_location;

    public void setOwner(Owner owner){
        this.owner = owner;
    }
    public Owner getOwner(){
        return this.owner;
    }
    public void setQuestionee(Questionee questionee){
        this.questionee = questionee;
    }
    public Questionee getQuestionee(){
        return this.questionee;
    }
    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return this.text;
    }
    public void setExpired(boolean expired){
        this.expired = expired;
    }
    public boolean getExpired(){
        return this.expired;
    }
    public void setAnonymous(boolean anonymous){
        this.anonymous = anonymous;
    }
    public boolean getAnonymous(){
        return this.anonymous;
    }
    public void setOwner_detail(OwnerDetail owner_detail){
        this.owner_detail = owner_detail;
    }
    public OwnerDetail getOwner_detail(){
        return this.owner_detail;
    }
    public void setOwner_location(String owner_location){
        this.owner_location = owner_location;
    }
    public String getOwner_location(){
        return this.owner_location;
    }

}

package cn.bugstack.chatbot.api.domain.zsxq.model.vo;

/**
 * @author 小傅哥，微信：fustack
 * @description
 * @github https://github.com/fuzhengwei
 * @copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class Topics {

    private String topic_id;

    private Group group;

    private String type;

    private Question question;

    private boolean answered;

    private int likes_count;

    private int rewards_count;

    private int comments_count;

    private int reading_count;

    private int readers_count;

    private boolean digested;

    private boolean sticky;

    private String create_time;

    private UserSpecific user_specific;

    public void setTopic_id(String topic_id){
        this.topic_id = topic_id;
    }
    public String getTopic_id(){
        return this.topic_id;
    }
    public void setGroup(Group group){
        this.group = group;
    }
    public Group getGroup(){
        return this.group;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setQuestion(Question question){
        this.question = question;
    }
    public Question getQuestion(){
        return this.question;
    }
    public void setAnswered(boolean answered){
        this.answered = answered;
    }
    public boolean getAnswered(){
        return this.answered;
    }
    public void setLikes_count(int likes_count){
        this.likes_count = likes_count;
    }
    public int getLikes_count(){
        return this.likes_count;
    }
    public void setRewards_count(int rewards_count){
        this.rewards_count = rewards_count;
    }
    public int getRewards_count(){
        return this.rewards_count;
    }
    public void setComments_count(int comments_count){
        this.comments_count = comments_count;
    }
    public int getComments_count(){
        return this.comments_count;
    }
    public void setReading_count(int reading_count){
        this.reading_count = reading_count;
    }
    public int getReading_count(){
        return this.reading_count;
    }
    public void setReaders_count(int readers_count){
        this.readers_count = readers_count;
    }
    public int getReaders_count(){
        return this.readers_count;
    }
    public void setDigested(boolean digested){
        this.digested = digested;
    }
    public boolean getDigested(){
        return this.digested;
    }
    public void setSticky(boolean sticky){
        this.sticky = sticky;
    }
    public boolean getSticky(){
        return this.sticky;
    }
    public void setCreate_time(String create_time){
        this.create_time = create_time;
    }
    public String getCreate_time(){
        return this.create_time;
    }
    public void setUser_specific(UserSpecific user_specific){
        this.user_specific = user_specific;
    }
    public UserSpecific getUser_specific(){
        return this.user_specific;
    }

}

package ua.training.task3;

public class Model {
    private Record record;

    public Model() {
        record = new Record();
    }

    public void setName(String name){
        record.name = name;
    }
    public void setSecondName(String secondName){
        record.secondName = secondName;
    }
    public void setSurname(String surname){
        record.surname = surname;
    }

    public void setShortFullName(String shortFullName){
        record.shortFullName = shortFullName;
    }
    public void setNickname(String nickname){
        record.nickname = nickname;
    }
    public void setComment(String comment){
        record.comment = comment;
    }

    public String getName(){
        return record.name;
    }
    public String getSecondName(){
        return record.secondName;
    }
    public String getSurname(){
        return record.surname;
    }

    public String getShortFullName(){
        return record.shortFullName;
    }
    public String getNickName(){
        return record.nickname;
    }
    public String getComment(){
        return record.comment;
    }
}

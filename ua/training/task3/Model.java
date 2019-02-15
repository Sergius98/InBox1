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

    public void setGroups(String groups){
        record.groups = groups;
    }
    public void setCityPhoneNumber(String cityPhoneNumber){
        record.cityPhoneNumber = cityPhoneNumber;
    }
    public void setMobilePhoneNumber(String mobilePhoneNumber){
        record.mobilePhoneNumber = mobilePhoneNumber;
    }
    public void setMobilePhoneNumber2(String mobilePhoneNumber2){
        record.mobilePhoneNumber2 = mobilePhoneNumber2;
    }

    public void setEmail(String email){
        record.email = email;
    }
    public void setSkype(String skype){
        record.skype = skype;
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


    public String getGroups(){
        return record.groups;
    }
    public String getCityPhoneNumber(){
        return record.cityPhoneNumber;
    }
    public String getMobilePhoneNumber(){
        return record.mobilePhoneNumber;
    }
    public String getMobilePhoneNumber2(){
        return record.mobilePhoneNumber2;
    }


    public String getEmail(){
        return record.email;
    }
    public String getSkype(){
        return record.skype;
    }
}

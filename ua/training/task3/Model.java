package ua.training.task3;

public class Model {
    private Record record;

    public Model() {
        setRecord(new Record());
    }


    public Record getRecord() {
        return record;
    }
    public void setRecord(Record record) {
        this.record = record;
    }
}

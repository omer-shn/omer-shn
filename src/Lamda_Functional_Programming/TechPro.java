package Lamda_Functional_Programming;

public class TechPro {
    private String batch;
    private String batchName;
    private int batcave;
    private int nunOfStudent;

    public TechPro(){ }

    public TechPro(String batch, String batchName, int batcave, int nunOfStudent) {
        this.batch = batch;
        this.batchName = batchName;
        this.batcave = batcave;
        this.nunOfStudent = nunOfStudent;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public int getBatcave() {
        return batcave;
    }

    public void setBatcave(int batcave) {
        this.batcave = batcave;
    }

    public int getNunOfStudent() {
        return nunOfStudent;
    }

    public void setNunOfStudent(int nunOfStudent) {
        this.nunOfStudent = nunOfStudent;
    }

    @Override
    public String toString() {
        return "TechPro{" +
                "batch='" + batch + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batcave=" + batcave +
                ", nunOfStudent=" + nunOfStudent +
                '}';
    }
}


import java.util.Objects;
import java.util.Random;


public class MyTestingClass {
    private int id;
    private String jobPosition;

    public MyTestingClass(String jobPosition) {
        this.id = id;
        this.jobPosition=jobPosition;

    }

    public String getJobPosition() {
        return jobPosition;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTestingClass that = (MyTestingClass) o;
        return Objects.equals(jobPosition, that.jobPosition);
    }

    @Override
    public int hashCode() {
        int res= 0;
        res = 17 * res + id;
        res = 17 * res + (jobPosition != null ? jobPosition.hashCode() : 0);
        System.out.print(res);
        return res;
    }

}

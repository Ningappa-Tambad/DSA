package BuilderDesignPattern;



public class Student
{

    private int id;
    private String name;
    private String universityname;
    private int gradyear;
    private int psp;
    private int age;
    private String phonenumber;



    private Student(int id, String name, String universityname, int gradyear, int psp, int age, String phonenumber) {
        this.id = id;
        this.name = name;
        this.universityname = universityname;
        this.gradyear = gradyear;
        this.psp = psp;
        this.age = age;
        this.phonenumber = phonenumber;
    }

    public static Builder builder()
    {
        return new Builder();
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", universityname='" + universityname + '\'' +
                ", gradyear=" + gradyear +
                ", psp=" + psp +
                ", age=" + age +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }
    public static class Builder
    {
        private int id;
        private String name;
        private String universityname;
        private int gradyear;
        private int psp;
        private int age;
        private String phonenumber;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder universityname(String universityname) {
            this.universityname = universityname;
            return this;
        }

        public Builder gradyear(int gradyear) {
            this.gradyear = gradyear;
            return this;
        }

        public Builder psp(int psp) {
            this.psp = psp;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder phonenumber(String phonenumber) {
            this.phonenumber = phonenumber;
            return this;
        }

        private void validate()
        {
            if(this.gradyear>2023)
            {
                throw new GradyearInvalidException();
            }

            if(this.name==null)
            {
                throw new InvalidNameException();
            }

            if(this.age < 18)
            {
                throw new InvalidAgeException();
            }
        }

        public Student build()
        {
            validate();
            return new Student(this.id,this.name,this.universityname,this.gradyear,this.psp,this.age,this.phonenumber);
        }
    }

}

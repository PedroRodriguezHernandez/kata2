package software;

public class Shoot {
    private final String id;
    private final String name;
    private final String date;
    private final String mannerOfDeath;
    private final String armed;
    private final String age;
    private final String gender;
    private final String race;
    private final String city;
    private final String state;
    private final String signsOfMentalIllness;
    private final String threatLevel;
    private final String flee;
    private final String bodyCamera;
    private final String armsCategory;

    public Shoot(String id, String name, String date, String mannerOfDeath, String armed, String age, String gender, String race, String city, String state, String signsOfMentalIllness, String threatLevel, String flee, String bodyCamera, String armsCategory) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.mannerOfDeath = mannerOfDeath;
        this.armed = armed;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.city = city;
        this.state = state;
        this.signsOfMentalIllness = signsOfMentalIllness;
        this.threatLevel = threatLevel;
        this.flee = flee;
        this.bodyCamera = bodyCamera;
        this.armsCategory = armsCategory;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getMannerOfDeath() {
        return mannerOfDeath;
    }

    public String getArmed() {
        return armed;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getSignsOfMentalIllness() {
        return signsOfMentalIllness;
    }

    public String getThreatLevel() {
        return threatLevel;
    }

    public String getFlee() {
        return flee;
    }

    public String getBodyCamera() {
        return bodyCamera;
    }

    public String getArmsCategory() {
        return armsCategory;
    }

    @Override
    public String toString() {
        return "Shoot{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", mannerOfDeath='" + mannerOfDeath + '\'' +
                ", armed='" + armed + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", signsOfMentalIllness='" + signsOfMentalIllness + '\'' +
                ", threatLevel='" + threatLevel + '\'' +
                ", flee='" + flee + '\'' +
                ", bodyCamera='" + bodyCamera + '\'' +
                ", armsCategory='" + armsCategory + '\'' +
                '}';
    }
}

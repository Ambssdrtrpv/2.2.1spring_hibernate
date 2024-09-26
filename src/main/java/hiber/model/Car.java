package hiber.model;


import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "model")
    String model;

    @Column(name = "series")
    int series;

    public Car() {}

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public Long getPerson_id() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public void setPerson_id(Long id) {
        this.id = id;
    }

    public User setUser(User user) {
        this.user = user;
        return user;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", id=" + id +
                ", series=" + series +
                '}';
    }
}

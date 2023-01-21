package pojo;  
import java.util.Date;  
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import static javax.persistence.GenerationType.IDENTITY;  
import javax.persistence.Id;  
import javax.persistence.Table;  
import javax.persistence.Temporal;  
import javax.persistence.TemporalType;  
/** 
 * User asus
 */  
@Entity  
@Table(name = "user", catalog = "aseloletraveljsf")  
public class User implements java.io.Serializable  
{  
    private Integer id;  
    private String recordNo;  
    private String name;  
    private Integer tickets;  
    private String destination;  
    private Date dob;  
    private String email;  
    public User()  
    {}  
    public User(String recordNo, String name, Integer age, String sex, Date dob, String remark)  
    {  
        this.recordNo = recordNo;  
        this.name = name;  
        this.tickets = tickets;  
        this.destination = destination;  
        this.dob = dob;  
        this.email = email;  
    }  
    @Id @GeneratedValue(strategy = IDENTITY)  
    @Column(name = "id", unique = true, nullable = false)  
    public Integer getId()  
    {  
        return this.id;  
    }  
    public void setId(Integer id)  
    {  
        this.id = id;  
    }  
    @Column(name = "RecordNo", length = 20)  
    public String getRecordNo()  
    {  
        return this.recordNo;  
    }  
    public void setRecordNo(String recordNo)  
    {  
        this.recordNo = recordNo;  
    }  
    @Column(name = "Name", length = 50)  
    public String getName()  
    {  
        return this.name;  
    }  
    public void setName(String name)  
    {  
        this.name = name;  
    }  
    @Column(name = "tickets")  
    public Integer gettickets()  
    {  
        return this.tickets;  
    }  
    public void settickets(Integer tickets)  
    {  
        this.tickets = tickets;  
    }  
    @Column(name = "destination", length = 20)  
    public String getdestination()  
    {  
        return this.destination;  
    }  
    public void setdestination(String destination)  
    {  
        this.destination = destination;  
    }  
    @Temporal(TemporalType.DATE)  
    @Column(name = "Dob", length = 10)  
    public Date getDob()  
    {  
        return this.dob;  
    }  
    public void setDob(Date dob)  
    {  
        this.dob = dob;  
    }  
    @Column(name = "email", length = 50)  
    public String getemail()  
    {  
        return this.email;  
    }  
    public void setemail(String email)  
    {  
        this.email = email;  
    }  
    //This method writes the values of contact object with System.out.println(user.toString()) code  
    @Override  
    public String toString()  
    {  
        return "user" +  
            "\n\t RecordNo: " + this.recordNo +  
            "\n\t EmployeeName: " + this.name +  
            "\n\t tickets: " + this.tickets +  
            "\n\t destination: " + this.destination +  
            "\n\t Date of Boking: " + this.dob +  
            "\n\t email: " + this.email;  
    }  
}  
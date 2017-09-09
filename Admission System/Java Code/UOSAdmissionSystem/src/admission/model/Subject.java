package admission.model;
// Generated Jun 30, 2014 5:25:15 PM by Hibernate Tools 3.6.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Subject generated by hbm2java
 */
@Entity
@Table(name = "subject"
)
public class Subject implements java.io.Serializable {

    private Integer subjectId;
    private Discipline discipline;
    private String name;
    private String remarks;
    private Boolean isNone;
    private Set<ProgramSubject> programSubjects = new HashSet<ProgramSubject>(0);

    public Subject() {
    }

    public Subject(Discipline discipline, String name, String remarks, Boolean isNone, Set<ProgramSubject> programSubjects) {
        this.discipline = discipline;
        this.name = name;
        this.remarks = remarks;
        this.isNone = isNone;
        this.programSubjects = programSubjects;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "subject_id", unique = true, nullable = false)
    public Integer getSubjectId() {
        return this.subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "discipline_id")
    public Discipline getDiscipline() {
        return this.discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    @Column(name = "name", length = 128)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "remarks", length = 45)
    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Column(name = "is_none")
    public Boolean getIsNone() {
        return this.isNone;
    }

    public void setIsNone(Boolean isNone) {
        this.isNone = isNone;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "subject")
    public Set<ProgramSubject> getProgramSubjects() {
        return this.programSubjects;
    }

    public void setProgramSubjects(Set<ProgramSubject> programSubjects) {
        this.programSubjects = programSubjects;
    }

    @Override
    public String toString() {
        if (this.getDiscipline() == null) {
            return name;
        } else {
            String r;
            if (this.getDiscipline().toString().equals("PSYCHOLOGY")) {
                r = this.getDiscipline().toString() + " (" + getDiscipline().getDepartment().getFaculty() + ")";
            } else {
                r = this.getDiscipline().toString();
            }
            return r;
        }
        //return this.getDiscipline() == null ? name : this.getDiscipline().toString();
    }

}
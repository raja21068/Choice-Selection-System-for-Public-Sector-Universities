package admission.model;
// Generated Jun 30, 2014 5:25:15 PM by Hibernate Tools 3.6.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * AppliedCampus generated by hbm2java
 */
@Entity
@Table(name = "applied_campus"
)
public class AppliedCampus implements java.io.Serializable {

    private Integer appliedCampusId;
    private Candidate candidate;
    private Campus campus;
    private String remarks;

    public AppliedCampus() {
    }

    public AppliedCampus(Candidate candidate, Campus campus) {
        this.candidate = candidate;
        this.campus = campus;
    }

    public AppliedCampus(Candidate candidate, Campus campus, String remarks) {
        this.candidate = candidate;
        this.campus = campus;
        this.remarks = remarks;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "applied_campus_id", unique = true, nullable = false)
    public Integer getAppliedCampusId() {
        return this.appliedCampusId;
    }

    public void setAppliedCampusId(Integer appliedCampusId) {
        this.appliedCampusId = appliedCampusId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "candidate_id", nullable = false)
    public Candidate getCandidate() {
        return this.candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "campus_id", nullable = false)
    public Campus getCampus() {
        return this.campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    @Column(name = "remarks", length = 45)
    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

}

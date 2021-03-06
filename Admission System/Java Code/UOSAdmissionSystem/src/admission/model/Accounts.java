package admission.model;
// Generated Jun 30, 2014 5:25:15 PM by Hibernate Tools 3.6.0

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Accounts generated by hbm2java
 */
@Entity
@Table(name = "accounts"
)
public class Accounts implements java.io.Serializable {

    private Integer accountId;
    private Candidate candidate;
    private Date regDate;
    private boolean active;
    private String remarks;
    private Set<PartRegistry> partRegistries = new HashSet<PartRegistry>(0);

    public Accounts() {
    }

    public Accounts(Candidate candidate, boolean active) {
        this.candidate = candidate;
        this.active = active;
    }

    public Accounts(Candidate candidate, Date regDate, boolean active, String remarks, Set<PartRegistry> partRegistries) {
        this.candidate = candidate;
        this.regDate = regDate;
        this.active = active;
        this.remarks = remarks;
        this.partRegistries = partRegistries;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "account_id", unique = true, nullable = false)
    public Integer getAccountId() {
        return this.accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "candidate_id", nullable = false)
    public Candidate getCandidate() {
        return this.candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "reg_date", length = 10)
    public Date getRegDate() {
        return this.regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    @Column(name = "active", nullable = false)
    public boolean isActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Column(name = "remarks", length = 45)
    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "accounts")
    public Set<PartRegistry> getPartRegistries() {
        return this.partRegistries;
    }

    public void setPartRegistries(Set<PartRegistry> partRegistries) {
        this.partRegistries = partRegistries;
    }

}

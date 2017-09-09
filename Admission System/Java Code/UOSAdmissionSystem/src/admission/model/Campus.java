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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Sort;
import org.hibernate.annotations.SortType;

/**
 * Campus generated by hbm2java
 */
@Entity
@Table(name = "campus"
)
public class Campus implements java.io.Serializable {

    private Integer campusId;
    private String name;
    private String location;
    private String code;
    private Boolean isMain;
    private Integer displayOrder;
    private String remarks;
    private Set<AdmissionList> admissionLists = new HashSet<AdmissionList>(0);
    private Set<CampusProgramOfStudy> campusProgramOfStudies = new HashSet<CampusProgramOfStudy>(0);
    private Set<CampusCategory> campusCategories = new HashSet<CampusCategory>(0);
    private Set<Test> tests = new HashSet<Test>(0);
    private Set<Jurisdiction> jurisdictions = new HashSet<Jurisdiction>(0);
    private Set<AppliedCampus> appliedCampuses = new HashSet<AppliedCampus>(0);

    public Campus() {
    }

    public Campus(String name, String location, String code, Boolean isMain, Integer displayOrder, String remarks, Set<AdmissionList> admissionLists, Set<CampusProgramOfStudy> campusProgramOfStudies, Set<CampusCategory> campusCategories, Set<Test> tests, Set<Jurisdiction> jurisdictions, Set<AppliedCampus> appliedCampuses) {
        this.name = name;
        this.location = location;
        this.code = code;
        this.isMain = isMain;
        this.displayOrder = displayOrder;
        this.remarks = remarks;
        this.admissionLists = admissionLists;
        this.campusProgramOfStudies = campusProgramOfStudies;
        this.campusCategories = campusCategories;
        this.tests = tests;
        this.jurisdictions = jurisdictions;
        this.appliedCampuses = appliedCampuses;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "campus_id", unique = true, nullable = false)
    public Integer getCampusId() {
        return this.campusId;
    }

    public void setCampusId(Integer campusId) {
        this.campusId = campusId;
    }

    @Column(name = "name", length = 45)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "location", length = 45)
    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Column(name = "code", length = 5)
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "is_main")
    public Boolean getIsMain() {
        return this.isMain;
    }

    public void setIsMain(Boolean isMain) {
        this.isMain = isMain;
    }

    @Column(name = "display_order")
    public Integer getDisplayOrder() {
        return this.displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    @Column(name = "remarks", length = 45)
    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "campus")
    public Set<AdmissionList> getAdmissionLists() {
        return this.admissionLists;
    }

    public void setAdmissionLists(Set<AdmissionList> admissionLists) {
        this.admissionLists = admissionLists;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "campus")
    public Set<CampusProgramOfStudy> getCampusProgramOfStudies() {
        return this.campusProgramOfStudies;
    }

    public void setCampusProgramOfStudies(Set<CampusProgramOfStudy> campusProgramOfStudies) {
        this.campusProgramOfStudies = campusProgramOfStudies;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "campus")
    public Set<CampusCategory> getCampusCategories() {
        return this.campusCategories;
    }

    public void setCampusCategories(Set<CampusCategory> campusCategories) {
        this.campusCategories = campusCategories;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "campus")
    public Set<Test> getTests() {
        return this.tests;
    }

    public void setTests(Set<Test> tests) {
        this.tests = tests;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "campus")
    public Set<Jurisdiction> getJurisdictions() {
        return this.jurisdictions;
    }

    public void setJurisdictions(Set<Jurisdiction> jurisdictions) {
        this.jurisdictions = jurisdictions;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "campus")
    public Set<AppliedCampus> getAppliedCampuses() {
        return this.appliedCampuses;
    }

    public void setAppliedCampuses(Set<AppliedCampus> appliedCampuses) {
        this.appliedCampuses = appliedCampuses;
    }

    @Override
    public String toString() {
        return this.getLocation();
    }

}
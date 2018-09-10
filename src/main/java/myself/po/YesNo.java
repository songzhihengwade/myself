package myself.po;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "t_yesno")
public class YesNo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "YESNO_ID",unique = true,nullable = false,columnDefinition = "int(11) COMMENT '判断题id'")
    private Long yesNoId;
    @Column(name = "YESNO_NAME",columnDefinition = "varchar(200) COMMENT '判断题问题内容'")
    private String yesNoName;
    @Column(name = "ANSWER",columnDefinition = "varchar(200) COMMENT '判断题内容'")
    private String answer;
    @Column(name = "STATUS",columnDefinition = "varchar(10) COMMENT '判断题状态'")
    private String status;
    @Column(name = "DEGREE",columnDefinition = "varchar(10) COMMENT '判断题难度'")
    private String degree;
    @Column(name = "ANALYSIS",columnDefinition = "varchar(200) COMMENT '判断题解析'")
    private String analysis;
    @Column(name = "LASTVERSIONID",columnDefinition = "int(11) COMMENT '上个版本的id'")
    private Integer lastVersionId;
    @Column(name = "CREATE_DATE",columnDefinition = "datetime COMMENT '创建时间'")
    private Date createDate;
    @Column(name = "UPDATEDATE",columnDefinition = "datetime COMMENT '更新时间'")
    private Date updateDate;

    public Long getYesNoId() {
        return yesNoId;
    }

    public void setYesNoId(Long yesNoId) {
        this.yesNoId = yesNoId;
    }

    public String getYesNoName() {
        return yesNoName;
    }

    public void setYesNoName(String yesNoName) {
        this.yesNoName = yesNoName;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public Integer getLastVersionId() {
        return lastVersionId;
    }

    public void setLastVersionId(Integer lastVersionId) {
        this.lastVersionId = lastVersionId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}

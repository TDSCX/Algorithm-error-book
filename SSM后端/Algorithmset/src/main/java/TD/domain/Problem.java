package TD.domain;

public class Problem {
    private Integer id;
    private String details;
    private String sourceurl;
    private String analysis;
    private String level;
    private String username;
    private String proname;

    @Override
    public String toString() {
        return "Problem{" +
                "id=" + id +
                ", details='" + details + '\'' +
                ", sourceurl='" + sourceurl + '\'' +
                ", analysis='" + analysis + '\'' +
                ", level='" + level + '\'' +
                ", username='" + username + '\'' +
                ", proname='" + proname + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getSourceurl() {
        return sourceurl;
    }

    public void setSourceurl(String sourceurl) {
        this.sourceurl = sourceurl;
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

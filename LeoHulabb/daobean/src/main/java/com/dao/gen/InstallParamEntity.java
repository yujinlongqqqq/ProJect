package main.java.com.dao.gen;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "InstallParam".
 */
public class InstallParamEntity {

    private Long id;
    private String DeviceType;
    private String SourceType;
    private String OnlyNumber;
    private Long CreateTime;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public InstallParamEntity() {
    }

    public InstallParamEntity(Long id) {
        this.id = id;
    }

    public InstallParamEntity(Long id, String DeviceType, String SourceType, String OnlyNumber, Long CreateTime) {
        this.id = id;
        this.DeviceType = DeviceType;
        this.SourceType = SourceType;
        this.OnlyNumber = OnlyNumber;
        this.CreateTime = CreateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceType() {
        return DeviceType;
    }

    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    public String getSourceType() {
        return SourceType;
    }

    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    public String getOnlyNumber() {
        return OnlyNumber;
    }

    public void setOnlyNumber(String OnlyNumber) {
        this.OnlyNumber = OnlyNumber;
    }

    public Long getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
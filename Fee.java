public class Fee {
    private Integer id; //资费 ID
	private String feeName; //资费名称
	private Integer baseDuration; //包在线时长
	private Float baseCost; //月固定费
	private Float unitCost; //单位费用
	private String status; //0：开通；1：暂停；
	private String descr; //资费信息说明
    private Date createTime; //创建日期
    private Date startTime; //启用日期

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFeeName() {
        return feeName;
    }

    public void setFeeName(String feeName) {
        this.feeName = feeName;
    }

    public Integer getBaseDuration() {
        return baseDuration;
    }

    public void setBaseDuration(Integer baseDuration) {
        this.baseDuration = baseDuration;
    }

    public Float getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(Float baseCost) {
        this.baseCost = baseCost;
    }

    public Float getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Float unitCost) {
        this.unitCost = unitCost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    //根据返回的结果生成资费对象
    public static Fee toFee(ResultSet rs) throws SQLException {
        Fee fee = new Fee();
        fee.setId(rs.getInt(1));
        fee.setFeeName(rs.getString(2));
        fee.setBaseDuration(rs.getInt(3));
        fee.setBaseCost(rs.getFloat(4));
        fee.setUnitCost(rs.getFloat(5));
        fee.setCreateTime(rs.getDate(6));
        fee.setStartTime(rs.getDate(7));
        fee.setStatus(rs.getString(8));
        fee.setDescr(rs.getString(9));
        return fee;
    }

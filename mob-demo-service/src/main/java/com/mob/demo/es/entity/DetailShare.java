package com.mob.demo.es.entity;

import com.lamfire.code.PUID;
import com.lamfire.elasticsearch.annotation.Entity;
import com.lamfire.elasticsearch.annotation.Id;
import com.lamfire.elasticsearch.annotation.Indexed;
import com.mob.elasticsearch.lamfire.entity.AbstractEntity;

/**
 * 分享详情
 * @author linrb
 *
 */
@Entity(indexName = "comtsys_detail_share", indexType="detail_share")
public class DetailShare extends AbstractEntity {
	public static String buildId(){
		return PUID.puidAsString();
	}
	
	@Id
	private String id; //PUID
	
	@Indexed
	private String appkey; //应用KEY列表
	
	@Indexed
	private String appver; //应用版本
	
	@Indexed
	private String apppkg; //应用包名

	@Indexed
	private Integer sdkver; //SDK版本号
	
	@Indexed
	private Integer plat; //设备平台
	
	@Indexed
	private String networktype;//网络类型,3G,WIFI,none
	
	@Indexed
	private String model;
	
	@Indexed
	private String sysver;
	
	@Indexed
	private String factory;//设备厂商
	
	@Indexed
	private Integer carrier;//设备的手机运营商

	@Indexed
	private String screensize;//设备的分辨率
	
	@Indexed
	private String deviceid; //设备ID
	
	@Indexed
	private String snsshareid; //第三方分享id
	
	@Indexed
	private String snsuid; //SNSID
	
	@Indexed
	private Integer snsplat; //SNS平台
	
	@Indexed
	private Integer gender; //性别
	
	@Indexed
	private Integer secrettype; //认证类型
	
	@Indexed
	private Long birthday; //生日

	@Indexed
	private Integer age; //年龄
	
	private String icon; //头像
	
	@Indexed
	private String nickname; //呢称
	
	@Indexed
	private String subjectid;//Subject的主键id
	
	@Indexed
	private String topicid;//开发者自己定义的主题id
	
	@Indexed
	private String commentid;//评论id
	
	@Indexed
	private String comment;
	
	@Indexed(type="ip")
	private String ipaddr;//客户端IP地址
	
	@Indexed
	private String country;//国家
	
	@Indexed
	private String province;//省份
	
	@Indexed
	private String city;//城市
	
	@Indexed(analyzed=true, analyzer="ik")
	private String content;
	
	@Indexed
	private String title;

	@Indexed
	private String authuserid;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAppkey() {
		return appkey;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public String getAppver() {
		return appver;
	}

	public void setAppver(String appver) {
		this.appver = appver;
	}

	public String getApppkg() {
		return apppkg;
	}

	public void setApppkg(String apppkg) {
		this.apppkg = apppkg;
	}

	public Integer getSdkver() {
		return sdkver;
	}

	public void setSdkver(Integer sdkver) {
		this.sdkver = sdkver;
	}

	public Integer getPlat() {
		return plat;
	}

	public void setPlat(Integer plat) {
		this.plat = plat;
	}

	public String getNetworktype() {
		return networktype;
	}

	public void setNetworktype(String networktype) {
		this.networktype = networktype;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSysver() {
		return sysver;
	}

	public void setSysver(String sysver) {
		this.sysver = sysver;
	}

	public String getFactory() {
		return factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public Integer getCarrier() {
		return carrier;
	}

	public void setCarrier(Integer carrier) {
		this.carrier = carrier;
	}

	public String getScreensize() {
		return screensize;
	}

	public void setScreensize(String screensize) {
		this.screensize = screensize;
	}

	public String getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

	public String getSnsuid() {
		return snsuid;
	}

	public void setSnsuid(String snsuid) {
		this.snsuid = snsuid;
	}

	public Integer getSnsplat() {
		return snsplat;
	}

	public void setSnsplat(Integer snsplat) {
		this.snsplat = snsplat;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getSecrettype() {
		return secrettype;
	}

	public void setSecrettype(Integer secrettype) {
		this.secrettype = secrettype;
	}

	public Long getBirthday() {
		return birthday;
	}

	public void setBirthday(Long birthday) {
		this.birthday = birthday;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(String subjectid) {
		this.subjectid = subjectid;
	}

	public String getTopicid() {
		return topicid;
	}

	public void setTopicid(String topicid) {
		this.topicid = topicid;
	}

	public String getCommentid() {
		return commentid;
	}

	public void setCommentid(String commentid) {
		this.commentid = commentid;
	}

	public String getIpaddr() {
		return ipaddr;
	}

	public void setIpaddr(String ipaddr) {
		this.ipaddr = ipaddr;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSnsshareid() {
		return snsshareid;
	}

	public void setSnsshareid(String snsshareid) {
		this.snsshareid = snsshareid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthuserid() {
		return authuserid;
	}

	public void setAuthuserid(String authuserid) {
		this.authuserid = authuserid;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}

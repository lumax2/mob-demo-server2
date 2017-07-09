package com.mob.demo.domain;

import com.lamfire.mongodb.morphia.annotations.Entity;
import com.lamfire.mongodb.morphia.annotations.Id;
import com.lamfire.mongodb.morphia.annotations.Indexed;
import com.lamfire.mongodb.morphia.utils.IndexDirection;

import java.io.Serializable;


/**
 * 评论详情
 *
 * @author linrb
 */
@Entity
public class Comment implements Serializable {
	
	public static final int TRASH_YES =1 ;
	public static final int TRASH_NO  =0 ;
	
	public static final int DELETE_YES =1 ;
	public static final int DELETE_NO = 0  ;

    @Id
    private String id;//评论ID，PUID

    @Indexed
    private String duid;//设备唯一标示 安卓：deviceid  iOS: adsid

    @Indexed
    private String appkey;//应用的KEY

    @Indexed
    private String userid;//用户id，PUID

    private String nickname;//用户昵称, 唯一索引

    private String avatar;//用户头像

    private Integer plat;//系统平台

    @Indexed(value = IndexDirection.DESC)
    private Long createat;//创建时间

    @Indexed
    private String videoid;//视频id

    private String content;//评论内容

    private Integer likecount = 0;//评论被赞的次数
    
    private Integer istrash = 0  ; // 是否为垃圾评论 1是  0 否
    
    private Integer isdelete  = 0   ; //  删除 1-是   2-否

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDuid() {
        return duid;
    }

    public void setDuid(String duid) {
        this.duid = duid;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getPlat() {
        return plat;
    }

    public void setPlat(Integer plat) {
        this.plat = plat;
    }

    public Long getCreateat() {
        return createat;
    }

    public void setCreateat(Long createat) {
        this.createat = createat;
    }


    public String getVideoid() {
        return videoid;
    }

    public void setVideoid(String videoid) {
        this.videoid = videoid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikecount() {
        return likecount;
    }

    public void setLikecount(Integer likecount) {
        this.likecount = likecount;
    }

	public Integer getIstrash() {
		return istrash;
	}

	public void setIstrash(Integer istrash) {
		this.istrash = istrash;
	}

	public Integer getIsdelete() {
		return isdelete;
	}

	public void setIsdelete(Integer isdelete) {
		this.isdelete = isdelete;
	}

    
}

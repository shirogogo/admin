package com.hzhetun.example.pojo;

import java.util.Date;

/**
 * @author cbk
 * @date 2017/12/23
 */
public class SystemFile{
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_file.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_file.file_origin_name
     *
     * @mbg.generated
     */
    private String fileOriginName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_file.file_new_name
     *
     * @mbg.generated
     */
    private String fileNewName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_file.file_mime
     *
     * @mbg.generated
     */
    private String fileMime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_file.file_size
     *
     * @mbg.generated
     */
    private Long fileSize;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_file.file_url
     *
     * @mbg.generated
     */
    private String fileUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_file.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_file.create_id
     *
     * @mbg.generated
     */
    private Integer createId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_file.id
     *
     * @return the value of system_file.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_file.id
     *
     * @param id the value for system_file.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_file.file_origin_name
     *
     * @return the value of system_file.file_origin_name
     *
     * @mbg.generated
     */
    public String getFileOriginName() {
        return fileOriginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_file.file_origin_name
     *
     * @param fileOriginName the value for system_file.file_origin_name
     *
     * @mbg.generated
     */
    public void setFileOriginName(String fileOriginName) {
        this.fileOriginName = fileOriginName == null ? null : fileOriginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_file.file_new_name
     *
     * @return the value of system_file.file_new_name
     *
     * @mbg.generated
     */
    public String getFileNewName() {
        return fileNewName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_file.file_new_name
     *
     * @param fileNewName the value for system_file.file_new_name
     *
     * @mbg.generated
     */
    public void setFileNewName(String fileNewName) {
        this.fileNewName = fileNewName == null ? null : fileNewName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_file.file_mime
     *
     * @return the value of system_file.file_mime
     *
     * @mbg.generated
     */
    public String getFileMime() {
        return fileMime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_file.file_mime
     *
     * @param fileMime the value for system_file.file_mime
     *
     * @mbg.generated
     */
    public void setFileMime(String fileMime) {
        this.fileMime = fileMime == null ? null : fileMime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_file.file_size
     *
     * @return the value of system_file.file_size
     *
     * @mbg.generated
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_file.file_size
     *
     * @param fileSize the value for system_file.file_size
     *
     * @mbg.generated
     */
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_file.file_url
     *
     * @return the value of system_file.file_url
     *
     * @mbg.generated
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_file.file_url
     *
     * @param fileUrl the value for system_file.file_url
     *
     * @mbg.generated
     */
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_file.create_time
     *
     * @return the value of system_file.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_file.create_time
     *
     * @param createTime the value for system_file.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_file.create_id
     *
     * @return the value of system_file.create_id
     *
     * @mbg.generated
     */
    public Integer getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_file.create_id
     *
     * @param createId the value for system_file.create_id
     *
     * @mbg.generated
     */
    public void setCreateId(Integer createId) {
        this.createId = createId;
    }
}
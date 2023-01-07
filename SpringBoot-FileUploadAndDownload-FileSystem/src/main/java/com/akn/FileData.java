package com.akn;

import java.time.LocalDateTime;

public class FileData {
	private String fileName;
	private String fileType;
	private Long fileSize;
	private LocalDateTime uploadDateTime;
	private String downloadUri;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public Long getFileSize() {
		return fileSize;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public LocalDateTime getUploadDateTime() {
		return uploadDateTime;
	}

	public void setUploadDateTime(LocalDateTime uploadDateTime) {
		this.uploadDateTime = uploadDateTime;
	}

	public String getDownloadUri() {
		return downloadUri;
	}

	public void setDownloadUri(String downloadUri) {
		this.downloadUri = downloadUri;
	}

	public FileData(String fileName, String fileType, Long fileSize, LocalDateTime uploadDateTime, String downloadUri) {
		super();
		this.fileName = fileName;
		this.fileType = fileType;
		this.fileSize = fileSize;
		this.uploadDateTime = uploadDateTime;
		this.downloadUri = downloadUri;
	}

	@Override
	public String toString() {
		return "FileData [fileName=" + fileName + ", fileType=" + fileType + ", fileSize=" + fileSize
				+ ", uploadDateTime=" + uploadDateTime + ", downloadUri=" + downloadUri + "]";
	}

	public FileData() {
	}
}

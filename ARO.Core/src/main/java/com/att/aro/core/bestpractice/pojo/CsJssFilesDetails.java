/*
 *  Copyright 2015 AT&T
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/
package com.att.aro.core.bestpractice.pojo;

public class CsJssFilesDetails {
	
	private double timeStamp;
	private String fileName;
	private long size;
		
	/**
	 * @return the timeStamp
	 */
	public double getTimeStamp() {
		return timeStamp;
	}
	/**
	 * @param timeStamp the timeStamp to set
	 */
	public void setTimeStamp(double timeStamp) {
		this.timeStamp = timeStamp;
	}
	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}
	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	/**
	 * @return the size
	 */
	public long getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(long size) {
		this.size = size;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		CsJssFilesDetails fileDetail = (CsJssFilesDetails) obj;
		if (!fileDetail.getFileName().equals(fileName)) {
			return false;
		}
		if (fileDetail.getSize() != size
				|| Double.doubleToLongBits(fileDetail.getTimeStamp()) != Double.doubleToLongBits(timeStamp)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(timeStamp);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) size;
		result = prime * result + fileName.hashCode();
		return result;
	}
}

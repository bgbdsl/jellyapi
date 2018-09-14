/*******************************************************************************
 * Copyright 2016 Brient Oh @ Pristine Core
 * boh@pristinecore.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package ai.bgbdsl.jellyapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Customer Entity
 *
 * @author Brient Oh
 */
@Entity
@Table(name = "tb_user_daily_cost")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String companyname;
	private String username;
	private String dailycost;
	private String monthlycost;
	
	
	/**
	 * Default protected constructor
	 */
	protected Customer() {}
	
	/**
	 * Customer constructor with first and last name
	 * @param firstname first name
	 * @param lastname last name
	 */
	public Customer(final String companyname, final String username, final String dailycost, final String monthlycost) {
		this.companyname = companyname;
		this.username = username;
		this.dailycost = dailycost;
		this.monthlycost = monthlycost;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * @return the firstname
	 */
	public String getCompanyname() {
		return companyname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setCompanyname(final String companyname) {
		this.companyname = companyname;
	}

	/**
	 * @return the lastname
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setUsername(final String username) {
		this.username = username;
	}

	/**
	 * @return the lastname
	 */
	public String getDailycost() {
		return dailycost;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setDailycost(final String dailycost) {
		this.dailycost = dailycost;
	}
	
	
	/**
	 * @return the lastname
	 */
	public String getMonthlycost() {
		return monthlycost;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setMonthlycost(final String monthlycost) {
		this.monthlycost = monthlycost;
	}
	
	
	
	
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [id=" + id + ", "
				+ "companyname=" + companyname
				+ ", username=" + username 
				+ ", dailycost=" + dailycost 
				+ ", monthlycost=" + monthlycost 				
				+ "]";
	}
}

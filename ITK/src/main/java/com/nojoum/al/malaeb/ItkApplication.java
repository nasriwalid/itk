package com.nojoum.al.malaeb;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nojoum.al.malaeb.dao.ICountry;
import com.nojoum.al.malaeb.dao.IFormation;
import com.nojoum.al.malaeb.dao.ILevel;
import com.nojoum.al.malaeb.entities.Country;
import com.nojoum.al.malaeb.entities.Formation;
import com.nojoum.al.malaeb.entities.Level;

@SpringBootApplication
public class ItkApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ItkApplication.class, args);
	ApplicationContext ctx = SpringApplication.run(ItkApplication.class,args);
	ICountry count=ctx.getBean(ICountry.class);
    count.save(new Country("Afghanistan"));
	count.save(new Country("Albania"));
	count.save(new Country("Algeria"));
	count.save(new Country("American Samoa"));
	count.save(new Country("Andorra"));
	count.save(new Country("Angola"));
	count.save(new Country("Anguilla"));
	count.save(new Country("Antarctica"));
	count.save(new Country("Antigua and Barbuda"));
	count.save(new Country("Argentina"));
	count.save(new Country("Armenia"));
	count.save(new Country("Aruba"));
	count.save(new Country("Australia"));
	count.save(new Country("Austria"));
	count.save(new Country("Azerbaijan"));
	count.save(new Country("Bahamas"));
	count.save(new Country("Bahrain"));
	count.save(new Country("Bangladesh"));
	count.save(new Country("Barbados"));
	count.save(new Country("Belarus"));
	count.save(new Country("Belgium"));
	count.save(new Country("Belize"));
	count.save(new Country("Benin"));
	count.save(new Country("Bermuda"));
	count.save(new Country("Bhutan"));
	count.save(new Country("Bolivia"));
	count.save(new Country("Bosnia and Herzegowina"));
	count.save(new Country("Botswana"));
	count.save(new Country("Bouvet Island"));
	count.save(new Country("Brazil"));
	count.save(new Country("British Indian Ocean Territory"));
	count.save(new Country("Brunei Darussalam"));
	count.save(new Country("Bulgaria"));
	count.save(new Country("Burkina Faso"));
	count.save(new Country("Burundi"));
	count.save(new Country("Cambodia"));
	count.save(new Country("Cameroon"));
	count.save(new Country("Canada"));
	count.save(new Country("Cape Verde"));
	count.save(new Country("Cayman Islands"));
	count.save(new Country("Central African Republic"));
	count.save(new Country("Chad"));
	count.save(new Country("Chile"));
	count.save(new Country("China"));
	count.save(new Country("Christmas Island"));
	count.save(new Country("Cocos (Keeling) Islands"));
	count.save(new Country("Colombia"));
	count.save(new Country("Comoros"));
	count.save(new Country("Congo"));
	count.save(new Country("Congo, the Democratic Republic of the"));
	count.save(new Country("Cook Islands"));
	count.save(new Country("Costa Rica"));
	count.save(new Country("Cote d'Ivoire"));
	count.save(new Country("Croatia (Hrvatska)"));
	count.save(new Country("Cuba"));
	count.save(new Country("Cyprus"));
	count.save(new Country("Czech Republic"));
	count.save(new Country("Denmark"));
	count.save(new Country("Djibouti"));
	count.save(new Country("Dominica"));
	count.save(new Country("Dominican Republic"));
	count.save(new Country("East Timor"));
	count.save(new Country("Ecuador"));
	count.save(new Country("Egypt"));
	count.save(new Country("El Salvador"));
	count.save(new Country("Equatorial Guinea"));
	count.save(new Country("Eritrea"));
	count.save(new Country("Estonia"));
	count.save(new Country("Ethiopia"));
	count.save(new Country("Falkland Islands (Malvinas)"));
	count.save(new Country("Faroe Islands"));
	count.save(new Country("Fiji"));
	count.save(new Country("Finland"));
	count.save(new Country("France"));
	count.save(new Country("France, Metropolitan"));
	count.save(new Country("French Guiana"));
	count.save(new Country("French Polynesia"));
	count.save(new Country("French Southern Territories"));
	count.save(new Country("Gabon"));
	count.save(new Country("Gambia"));
	count.save(new Country("Georgia"));
	count.save(new Country("Germany"));
	count.save(new Country("Ghana"));
	count.save(new Country("Gibraltar"));
	count.save(new Country("Greece"));
	count.save(new Country("Greenland"));
	count.save(new Country("Grenada"));
	count.save(new Country("Guadeloupe"));
	count.save(new Country("Guam"));
	count.save(new Country("Guatemala"));
	count.save(new Country("Guinea"));
	count.save(new Country("Guinea-Bissau"));
	count.save(new Country("Guyana"));
	count.save(new Country("Haiti"));
	count.save(new Country("Heard and Mc Donald Islands"));
	count.save(new Country("Holy See (Vatican City State)"));
	count.save(new Country("Honduras"));
	count.save(new Country("Hong Kong"));
	count.save(new Country("Hungary"));
	count.save(new Country("Iceland"));
	count.save(new Country("India"));
	count.save(new Country("Indonesia"));
	count.save(new Country("Iran (Islamic Republic of)"));
	count.save(new Country("Iraq"));
	count.save(new Country("Ireland"));
	count.save(new Country("Israel"));
	count.save(new Country("Italy"));
	count.save(new Country("Jamaica"));
	count.save(new Country("Japan"));
	count.save(new Country("Jordan"));
	count.save(new Country("Kazakhstan"));
	count.save(new Country("Kenya"));
	count.save(new Country("Kiribati"));
	count.save(new Country("Korea, Democratic People's Republic of"));
	count.save(new Country("Korea, Republic of"));
	count.save(new Country("Kuwait"));
	count.save(new Country("Kyrgyzstan"));
	count.save(new Country("Lao People's Democratic Republic"));
	count.save(new Country("Latvia"));
	count.save(new Country("Lebanon"));
	count.save(new Country("Lesotho"));
	count.save(new Country("Liberia"));
	count.save(new Country("Libyan Arab Jamahiriya"));
	count.save(new Country("Liechtenstein"));
	count.save(new Country("Lithuania"));
	count.save(new Country("Luxembourg"));
	count.save(new Country("Macau"));
	count.save(new Country("Macedonia, The Former Yugoslav Republic of"));
	count.save(new Country("Madagascar"));
	count.save(new Country("Malawi"));
	count.save(new Country("Malaysia"));
	count.save(new Country("Maldives"));
	count.save(new Country("Mali"));
	count.save(new Country("Malta"));
	count.save(new Country("Marshall Islands"));
	count.save(new Country("Martinique"));
	count.save(new Country("Mauritania"));
	count.save(new Country("Mauritius"));
	count.save(new Country("Mayotte"));
	count.save(new Country("Mexico"));
	count.save(new Country("Micronesia, Federated States of"));
	count.save(new Country("Moldova, Republic of"));
	count.save(new Country("Monaco"));
	count.save(new Country("Mongolia"));
	count.save(new Country("Montserrat"));
	count.save(new Country("Morocco"));
	count.save(new Country("Mozambique"));
	count.save(new Country("Myanmar"));
	count.save(new Country("Namibia"));
	count.save(new Country("Nauru"));
	count.save(new Country("Nepal"));
	count.save(new Country("Netherlands"));
	count.save(new Country("Netherlands Antilles"));
	count.save(new Country("New Caledonia"));
	count.save(new Country("New Zealand"));
	count.save(new Country("Nicaragua"));
	count.save(new Country("Niger"));
	count.save(new Country("Nigeria"));
	count.save(new Country("Niue"));
	count.save(new Country("Norfolk Island"));
	count.save(new Country("Northern Mariana Islands"));
	count.save(new Country("Norway"));
	count.save(new Country("Oman"));
	count.save(new Country("Pakistan"));
	count.save(new Country("Palau"));
	count.save(new Country("Panama"));
	count.save(new Country("Papua New Guinea"));
	count.save(new Country("Paraguay"));
	count.save(new Country("Peru"));
	count.save(new Country("Philippines"));
	count.save(new Country("Pitcairn"));
	count.save(new Country("Poland"));
	count.save(new Country("Portugal"));
	count.save(new Country("Puerto Rico"));
	count.save(new Country("Qatar"));
	count.save(new Country("Reunion"));
	count.save(new Country("Romania"));
	count.save(new Country("Russian Federation"));
	count.save(new Country("Rwanda"));
	count.save(new Country("Saint Kitts and Nevis")); 
	count.save(new Country("Saint LUCIA"));
	count.save(new Country("Saint Vincent and the Grenadines"));
	count.save(new Country("Samoa"));
	count.save(new Country("San Marino"));
	count.save(new Country("Sao Tome and Principe")); 
	count.save(new Country("Saudi Arabia"));
	count.save(new Country("Senegal"));
	count.save(new Country("Seychelles"));
	count.save(new Country("Sierra Leone"));
	count.save(new Country("Singapore"));
	count.save(new Country("Slovakia (Slovak Republic)"));
	count.save(new Country("Slovenia"));
	count.save(new Country("Solomon Islands"));
	count.save(new Country("Somalia"));
	count.save(new Country("South Africa"));
	count.save(new Country("South Georgia and the South Sandwich Islands"));
	count.save(new Country("Spain"));
	count.save(new Country("Sri Lanka"));
	count.save(new Country("St. Helena"));
	count.save(new Country("St. Pierre and Miquelon"));
	count.save(new Country("Sudan"));
	count.save(new Country("Suriname"));
	count.save(new Country("Svalbard and Jan Mayen Islands"));
	count.save(new Country("Swaziland"));
	count.save(new Country("Sweden"));
	count.save(new Country("Switzerland"));
	count.save(new Country("Syrian Arab Republic"));
	count.save(new Country("Taiwan, Province of China"));
	count.save(new Country("Tajikistan"));
	count.save(new Country("Tanzania, United Republic of"));
	count.save(new Country("Thailand"));
	count.save(new Country("Togo"));
	count.save(new Country("Tokelau"));
	count.save(new Country("Tonga"));
	count.save(new Country("Trinidad and Tobago"));
	count.save(new Country("Tunisia"));
	count.save(new Country("Turkey"));
	count.save(new Country("Turkmenistan"));
	count.save(new Country("Turks and Caicos Islands"));
	count.save(new Country("Tuvalu"));
	count.save(new Country("Uganda"));
	count.save(new Country("Ukraine"));
	count.save(new Country("United Arab Emirates"));
	count.save(new Country("United Kingdom"));
	count.save(new Country("United States"));
	count.save(new Country("United States Minor Outlying Islands"));
	count.save(new Country("Uruguay"));
	count.save(new Country("Uzbekistan"));
	count.save(new Country("Vanuatu"));
	count.save(new Country("Venezuela"));
	count.save(new Country("Viet Nam"));
	count.save(new Country("Virgin Islands (British)"));
	count.save(new Country("Virgin Islands (U.S.)"));
	count.save(new Country("Wallis and Futuna Islands"));
	count.save(new Country("Western Sahara"));
	count.save(new Country("Yemen"));
	count.save(new Country("Yugoslavia"));
	count.save(new Country("Zambia"));
	count.save(new Country("Zimbabwe"));
	ILevel levelss=ctx.getBean(ILevel.class);
	levelss.save(new Level("Mastère"));
	levelss.save(new Level("doctorant"));
	levelss.save(new Level("license"));
	
	//adding formation 
	IFormation formationet=ctx.getBean(IFormation.class);
	formationet.save(new Formation("Athlète"));
	formationet.save(new Formation("Basketball"));
	formationet.save(new Formation("Football"));
	formationet.save(new Formation("Handball"));
	
	}
}

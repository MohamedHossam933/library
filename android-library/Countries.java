package com.mkandeel.countryandcity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Countries {
    private HashMap<String,String> mCountries=null;
    private HashMap<String,Integer> mCountryCityArrayMap=null;
    private Countries countries = null;

    public Countries(){
        if (mCountries==null) {
            mCountries = new HashMap<>();
            mCountries = MapAllCountries();
        }
        if (mCountryCityArrayMap == null) {
            mCountryCityArrayMap = new HashMap<>();
        }
    }

    public Countries getInstance() {
        if (countries == null) {
            countries = new Countries();
        }
        return countries;
    }

    public String getCountryCode(String countryName){
        String countryCode = null;
        if(mCountries.size()>0)
        {
            for(Map.Entry<String, String> entry : mCountries.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if(value.equalsIgnoreCase(countryName)){
                    countryCode = key;
                    break;
                }
            }
        }
        return countryCode;
    }

    private HashMap<String,Integer>getCountryCityMappings(){
        if(mCountryCityArrayMap.size()>0)
            return mCountryCityArrayMap;
        else {
            mCountryCityArrayMap.put("AF", R.array.AF);
            mCountryCityArrayMap.put("AL", R.array.AL);
            mCountryCityArrayMap.put("DZ", R.array.DZ);
            mCountryCityArrayMap.put("AS", R.array.AS);
            mCountryCityArrayMap.put("AD", R.array.AD);
            mCountryCityArrayMap.put("AO", R.array.AO);
            mCountryCityArrayMap.put("AI", R.array.AI);
            mCountryCityArrayMap.put("AQ", R.array.AQ);
            mCountryCityArrayMap.put("AG", R.array.AG);
            mCountryCityArrayMap.put("AR", R.array.AR);
            mCountryCityArrayMap.put("AM", R.array.AM);
            mCountryCityArrayMap.put("AW", R.array.AW);
            mCountryCityArrayMap.put("AU", R.array.AU);
            mCountryCityArrayMap.put("AT", R.array.AT);
            mCountryCityArrayMap.put("AZ", R.array.AZ);
            mCountryCityArrayMap.put("BS", R.array.BS);
            mCountryCityArrayMap.put("BH", R.array.BH);
            mCountryCityArrayMap.put("BD", R.array.BD);
            mCountryCityArrayMap.put("BB", R.array.BB);
            mCountryCityArrayMap.put("BY", R.array.BY);
            mCountryCityArrayMap.put("BE", R.array.BE);
            mCountryCityArrayMap.put("BZ", R.array.BZ);
            mCountryCityArrayMap.put("BJ", R.array.BJ);
            mCountryCityArrayMap.put("BM", R.array.BM);
            mCountryCityArrayMap.put("BT", R.array.BT);
            mCountryCityArrayMap.put("BO", R.array.BO);
            mCountryCityArrayMap.put("BA", R.array.BA);
            mCountryCityArrayMap.put("BW", R.array.BW);
            mCountryCityArrayMap.put("BR", R.array.BR);
            mCountryCityArrayMap.put("IO", R.array.IO);
            mCountryCityArrayMap.put("BN", R.array.BN);
            mCountryCityArrayMap.put("BG", R.array.BG);
            mCountryCityArrayMap.put("BF", R.array.BF);
            mCountryCityArrayMap.put("BI", R.array.BI);
            mCountryCityArrayMap.put("KH", R.array.KH);
            mCountryCityArrayMap.put("CM", R.array.CM);
            mCountryCityArrayMap.put("CA", R.array.CA);
            mCountryCityArrayMap.put("CV", R.array.CV);
            mCountryCityArrayMap.put("KY", R.array.KY);
            mCountryCityArrayMap.put("CF", R.array.CF);
            mCountryCityArrayMap.put("TD", R.array.TD);
            mCountryCityArrayMap.put("CL", R.array.CL);
            mCountryCityArrayMap.put("CN", R.array.CN);
            mCountryCityArrayMap.put("CX", R.array.CX);
            mCountryCityArrayMap.put("CC", R.array.CC);
            mCountryCityArrayMap.put("CO", R.array.CO);
            mCountryCityArrayMap.put("KM", R.array.KM);
            mCountryCityArrayMap.put("CG", R.array.CG);
            mCountryCityArrayMap.put("CD", R.array.CD);
            mCountryCityArrayMap.put("CK", R.array.CK);
            mCountryCityArrayMap.put("CR", R.array.CR);
            mCountryCityArrayMap.put("HR", R.array.HR);
            mCountryCityArrayMap.put("CU", R.array.CU);
            mCountryCityArrayMap.put("CY", R.array.CY);
            mCountryCityArrayMap.put("CZ", R.array.CZ);
            mCountryCityArrayMap.put("DK", R.array.DK);
            mCountryCityArrayMap.put("DJ", R.array.DJ);
            mCountryCityArrayMap.put("DM", R.array.DM);
            mCountryCityArrayMap.put("DO", R.array.DO);
            mCountryCityArrayMap.put("EC", R.array.EC);
            mCountryCityArrayMap.put("EG", R.array.EG);
            mCountryCityArrayMap.put("SV", R.array.SV);
            mCountryCityArrayMap.put("GQ", R.array.GQ);
            mCountryCityArrayMap.put("ER", R.array.ER);
            mCountryCityArrayMap.put("EE", R.array.EE);
            mCountryCityArrayMap.put("ET", R.array.ET);
            mCountryCityArrayMap.put("FK", R.array.FK);
            mCountryCityArrayMap.put("FO", R.array.FO);
            mCountryCityArrayMap.put("FJ", R.array.FJ);
            mCountryCityArrayMap.put("FI", R.array.FI);
            mCountryCityArrayMap.put("FR", R.array.FR);
            mCountryCityArrayMap.put("GF", R.array.GF);
            mCountryCityArrayMap.put("PF", R.array.PF);
            mCountryCityArrayMap.put("TF", R.array.TF);
            mCountryCityArrayMap.put("GA", R.array.GA);
            mCountryCityArrayMap.put("GM", R.array.GM);
            mCountryCityArrayMap.put("GE", R.array.GE);
            mCountryCityArrayMap.put("DE", R.array.DE);
            mCountryCityArrayMap.put("GH", R.array.GH);
            mCountryCityArrayMap.put("GI", R.array.GI);
            mCountryCityArrayMap.put("GR", R.array.GR);
            mCountryCityArrayMap.put("GL", R.array.GL);
            mCountryCityArrayMap.put("GD", R.array.GD);
            mCountryCityArrayMap.put("GP", R.array.GP);
            mCountryCityArrayMap.put("GU", R.array.GU);
            mCountryCityArrayMap.put("GT", R.array.GT);
            mCountryCityArrayMap.put("GG", R.array.CG);
            mCountryCityArrayMap.put("GN", R.array.GN);
            mCountryCityArrayMap.put("GW", R.array.GW);
            mCountryCityArrayMap.put("GY", R.array.GY);
            mCountryCityArrayMap.put("HT", R.array.HT);
            mCountryCityArrayMap.put("HN", R.array.HN);
            mCountryCityArrayMap.put("HK", R.array.HK);
            mCountryCityArrayMap.put("HU", R.array.HU);
            mCountryCityArrayMap.put("IS", R.array.IS);
            mCountryCityArrayMap.put("IN", R.array.IN);
            mCountryCityArrayMap.put("ID", R.array.ID);
            mCountryCityArrayMap.put("IR", R.array.IR);
            mCountryCityArrayMap.put("IQ", R.array.IQ);
            mCountryCityArrayMap.put("IE", R.array.IE);
            mCountryCityArrayMap.put("IM", R.array.IM);
            mCountryCityArrayMap.put("IL", R.array.IL);
            mCountryCityArrayMap.put("IT", R.array.IT);
            mCountryCityArrayMap.put("JM", R.array.JM);
            mCountryCityArrayMap.put("JP", R.array.JP);
            mCountryCityArrayMap.put("JE", R.array.JE);
            mCountryCityArrayMap.put("JO", R.array.JO);
            mCountryCityArrayMap.put("KZ", R.array.KZ);
            mCountryCityArrayMap.put("KE", R.array.KE);
            mCountryCityArrayMap.put("KI", R.array.KI);
            mCountryCityArrayMap.put("KR", R.array.KR);
            mCountryCityArrayMap.put("KW", R.array.KW);
            mCountryCityArrayMap.put("KG", R.array.KG);
            mCountryCityArrayMap.put("LA", R.array.LA);
            mCountryCityArrayMap.put("LV", R.array.LV);
            mCountryCityArrayMap.put("LB", R.array.LB);
            mCountryCityArrayMap.put("LS", R.array.LS);
            mCountryCityArrayMap.put("LR", R.array.LR);
            mCountryCityArrayMap.put("LI", R.array.LI);
            mCountryCityArrayMap.put("LT", R.array.LT);
            mCountryCityArrayMap.put("LU", R.array.LU);
            mCountryCityArrayMap.put("MO", R.array.MO);
            mCountryCityArrayMap.put("MK", R.array.MK);
            mCountryCityArrayMap.put("MG", R.array.MG);
            mCountryCityArrayMap.put("MW", R.array.MW);
            mCountryCityArrayMap.put("MY", R.array.MY);
            mCountryCityArrayMap.put("MV", R.array.MV);
            mCountryCityArrayMap.put("ML", R.array.ML);
            mCountryCityArrayMap.put("MT", R.array.MT);
            mCountryCityArrayMap.put("MH", R.array.MH);
            mCountryCityArrayMap.put("MQ", R.array.MQ);
            mCountryCityArrayMap.put("MR", R.array.MR);
            mCountryCityArrayMap.put("MU", R.array.MU);
            mCountryCityArrayMap.put("YT", R.array.YT);
            mCountryCityArrayMap.put("MX", R.array.MX);
            mCountryCityArrayMap.put("FM", R.array.FM);
            mCountryCityArrayMap.put("MD", R.array.MD);
            mCountryCityArrayMap.put("MC", R.array.MC);
            mCountryCityArrayMap.put("MN", R.array.MN);
            mCountryCityArrayMap.put("ME", R.array.ME);
            mCountryCityArrayMap.put("MS", R.array.MS);
            mCountryCityArrayMap.put("MA", R.array.MA);
            mCountryCityArrayMap.put("MZ", R.array.MZ);
            mCountryCityArrayMap.put("MM", R.array.MM);
            mCountryCityArrayMap.put("NA", R.array.NA);
            mCountryCityArrayMap.put("NR", R.array.NR);
            mCountryCityArrayMap.put("NP", R.array.NP);
            mCountryCityArrayMap.put("NL", R.array.NL);
            mCountryCityArrayMap.put("AN", R.array.AN);
            mCountryCityArrayMap.put("NC", R.array.NC);
            mCountryCityArrayMap.put("NZ", R.array.NZ);
            mCountryCityArrayMap.put("NI", R.array.NI);
            mCountryCityArrayMap.put("NE", R.array.NE);
            mCountryCityArrayMap.put("NG", R.array.NG);
            mCountryCityArrayMap.put("NU", R.array.NU);
            mCountryCityArrayMap.put("NF", R.array.NF);
            mCountryCityArrayMap.put("MP", R.array.MP);
            mCountryCityArrayMap.put("NO", R.array.NO);
            mCountryCityArrayMap.put("OM", R.array.OM);
            mCountryCityArrayMap.put("PK", R.array.PK);
            mCountryCityArrayMap.put("PW", R.array.PW);
            mCountryCityArrayMap.put("PA", R.array.PA);
            mCountryCityArrayMap.put("PG", R.array.PG);
            mCountryCityArrayMap.put("PY", R.array.PY);
            mCountryCityArrayMap.put("PE", R.array.PE);
            mCountryCityArrayMap.put("PH", R.array.PH);
            mCountryCityArrayMap.put("PN", R.array.PN);
            mCountryCityArrayMap.put("PL", R.array.PL);
            mCountryCityArrayMap.put("PT", R.array.PT);
            mCountryCityArrayMap.put("PR", R.array.PR);
            mCountryCityArrayMap.put("QA", R.array.QA);
            mCountryCityArrayMap.put("RE", R.array.RE);
            mCountryCityArrayMap.put("RO", R.array.RO);
            mCountryCityArrayMap.put("RU", R.array.RU);
            mCountryCityArrayMap.put("RW", R.array.RW);
            mCountryCityArrayMap.put("BL", R.array.BL);
            mCountryCityArrayMap.put("SH", R.array.SH);
            mCountryCityArrayMap.put("KN", R.array.KN);
            mCountryCityArrayMap.put("LC", R.array.LC);
            mCountryCityArrayMap.put("MF", R.array.MF);
            mCountryCityArrayMap.put("PM", R.array.PM);
            mCountryCityArrayMap.put("VC", R.array.VC);
            mCountryCityArrayMap.put("WS", R.array.WS);
            mCountryCityArrayMap.put("SM", R.array.SM);
            mCountryCityArrayMap.put("ST", R.array.ST);
            mCountryCityArrayMap.put("SA", R.array.SA);
            mCountryCityArrayMap.put("SN", R.array.SN);
            mCountryCityArrayMap.put("RS", R.array.RS);
            mCountryCityArrayMap.put("SC", R.array.SC);
            mCountryCityArrayMap.put("SL", R.array.SL);
            mCountryCityArrayMap.put("SG", R.array.SG);
            mCountryCityArrayMap.put("SK", R.array.SK);
            mCountryCityArrayMap.put("SI", R.array.SI);
            mCountryCityArrayMap.put("SB", R.array.SB);
            mCountryCityArrayMap.put("SO", R.array.SO);
            mCountryCityArrayMap.put("ZA", R.array.ZA);
            mCountryCityArrayMap.put("GS", R.array.GS);
            mCountryCityArrayMap.put("ES", R.array.ES);
            mCountryCityArrayMap.put("LK", R.array.LK);
            mCountryCityArrayMap.put("SD", R.array.SD);
            mCountryCityArrayMap.put("SR", R.array.SR);
            mCountryCityArrayMap.put("SJ", R.array.SJ);
            mCountryCityArrayMap.put("SZ", R.array.SZ);
            mCountryCityArrayMap.put("SE", R.array.SE);
            mCountryCityArrayMap.put("CH", R.array.CH);
            mCountryCityArrayMap.put("SY", R.array.SY);
            mCountryCityArrayMap.put("TW", R.array.TW);
            mCountryCityArrayMap.put("TJ", R.array.TJ);
            mCountryCityArrayMap.put("TZ", R.array.TZ);
            mCountryCityArrayMap.put("TH", R.array.TH);
            mCountryCityArrayMap.put("TL", R.array.TL);
            mCountryCityArrayMap.put("TG", R.array.TG);
            mCountryCityArrayMap.put("TK", R.array.TK);
            mCountryCityArrayMap.put("TO", R.array.TO);
            mCountryCityArrayMap.put("TT", R.array.TT);
            mCountryCityArrayMap.put("TN", R.array.TN);
            mCountryCityArrayMap.put("TR", R.array.TR);
            mCountryCityArrayMap.put("TM", R.array.TM);
            mCountryCityArrayMap.put("TC", R.array.TC);
            mCountryCityArrayMap.put("TV", R.array.TV);
            mCountryCityArrayMap.put("UG", R.array.UG);
            mCountryCityArrayMap.put("UA", R.array.UA);
            mCountryCityArrayMap.put("AE", R.array.AE);
            mCountryCityArrayMap.put("GB", R.array.GB);
            mCountryCityArrayMap.put("US", R.array.US);
            mCountryCityArrayMap.put("UM", R.array.UM);
            mCountryCityArrayMap.put("UY", R.array.UY);
            mCountryCityArrayMap.put("UZ", R.array.UZ);
            mCountryCityArrayMap.put("VU", R.array.VU);
            mCountryCityArrayMap.put("VE", R.array.VE);
            mCountryCityArrayMap.put("VN", R.array.VN);
            mCountryCityArrayMap.put("VG", R.array.VG);
            mCountryCityArrayMap.put("VI", R.array.VI);
            mCountryCityArrayMap.put("WF", R.array.WF);
            mCountryCityArrayMap.put("EH", R.array.EH);
            mCountryCityArrayMap.put("YE", R.array.YE);
            mCountryCityArrayMap.put("ZM", R.array.ZM);
            mCountryCityArrayMap.put("ZW", R.array.ZW);

            return mCountryCityArrayMap;
        }
    }

    public Integer getCityArrayReference(String countryCode){
        Integer val = -1;

        if(mCountryCityArrayMap.size() == 0)
            getCountryCityMappings();

        if(mCountryCityArrayMap.size()>0){
            for(Map.Entry<String, Integer> entry : mCountryCityArrayMap.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                if(key.equalsIgnoreCase(countryCode)){
                    val = value;
                    break;
                }
            }
        }
        return val;
    }

    public HashMap<String, String> MapAllCountries() {
        if (mCountries.size() > 0) {
            return mCountries;
        } else {
            mCountries.put("AF", "Afghanistan");
            mCountries.put("AL", "Albania");
            mCountries.put("DZ", "Algeria");
            mCountries.put("AS", "American Samoa");
            mCountries.put("AD", "Andorra");
            mCountries.put("AO", "Angola");
            mCountries.put("AI", "Anguilla");
            mCountries.put("AQ", "Antarctica");
            mCountries.put("AG", "Antigua And Barbuda");
            mCountries.put("AR", "Argentina");
            mCountries.put("AM", "Armenia");
            mCountries.put("AW", "Aruba");
            mCountries.put("AU", "Australia");
            mCountries.put("AT", "Austria");
            mCountries.put("AZ", "Azerbaijan");
            mCountries.put("BS", "Bahamas");
            mCountries.put("BH", "Bahrain");
            mCountries.put("BD", "Bangladesh");
            mCountries.put("BB", "Barbados");
            mCountries.put("BY", "Belarus");
            mCountries.put("BE", "Belgium");
            mCountries.put("BZ", "Belize");
            mCountries.put("BJ", "Benin");
            mCountries.put("BM", "Bermuda");
            mCountries.put("BT", "Bhutan");
            mCountries.put("BO", "Bolivia");
            mCountries.put("BA", "Bosnia And Herzegovina");
            mCountries.put("BW", "Botswana");
            mCountries.put("BR", "Brazil");
            mCountries.put("IO", "British Indian Ocean Territory");
            mCountries.put("BN", "Brunei Darussalam");
            mCountries.put("BG", "Bulgaria");
            mCountries.put("BF", "Burkina Faso");
            mCountries.put("BI", "Burundi");
            mCountries.put("KH", "Cambodia");
            mCountries.put("CM", "Cameroon");
            mCountries.put("CA", "Canada");
            mCountries.put("CV", "Cape Verde");
            mCountries.put("KY", "Cayman Islands");
            mCountries.put("CF", "Central African Republic");
            mCountries.put("TD", "Chad");
            mCountries.put("CL", "Chile");
            mCountries.put("CN", "China");
            mCountries.put("CX", "Christmas Island");
            mCountries.put("CC", "Cocos (Keeling) Islands");
            mCountries.put("CO", "Colombia");
            mCountries.put("KM", "Comoros");
            mCountries.put("CG", "Congo");
            mCountries.put("CD", "Congo, Democratic Republic");
            mCountries.put("CK", "Cook Islands");
            mCountries.put("CR", "Costa Rica");
            mCountries.put("HR", "Croatia");
            mCountries.put("CU", "Cuba");
            mCountries.put("CY", "Cyprus");
            mCountries.put("CZ", "Czech Republic");
            mCountries.put("DK", "Denmark");
            mCountries.put("DJ", "Djibouti");
            mCountries.put("DM", "Dominica");
            mCountries.put("DO", "Dominican Republic");
            mCountries.put("EC", "Ecuador");
            mCountries.put("EG", "Egypt");
            mCountries.put("SV", "El Salvador");
            mCountries.put("GQ", "Equatorial Guinea");
            mCountries.put("ER", "Eritrea");
            mCountries.put("EE", "Estonia");
            mCountries.put("ET", "Ethiopia");
            mCountries.put("FK", "Falkland Islands (Malvinas)");
            mCountries.put("FO", "Faroe Islands");
            mCountries.put("FJ", "Fiji");
            mCountries.put("FI", "Finland");
            mCountries.put("FR", "France");
            mCountries.put("GF", "French Guiana");
            mCountries.put("PF", "French Polynesia");
            mCountries.put("TF", "French Southern Territories");
            mCountries.put("GA", "Gabon");
            mCountries.put("GM", "Gambia");
            mCountries.put("GE", "Georgia");
            mCountries.put("DE", "Germany");
            mCountries.put("GH", "Ghana");
            mCountries.put("GI", "Gibraltar");
            mCountries.put("GR", "Greece");
            mCountries.put("GL", "Greenland");
            mCountries.put("GD", "Grenada");
            mCountries.put("GP", "Guadeloupe");
            mCountries.put("GU", "Guam");
            mCountries.put("GT", "Guatemala");
            mCountries.put("GG", "Guernsey");
            mCountries.put("GN", "Guinea");
            mCountries.put("GW", "Guinea-Bissau");
            mCountries.put("GY", "Guyana");
            mCountries.put("HT", "Haiti");
            mCountries.put("HN", "Honduras");
            mCountries.put("HK", "Hong Kong");
            mCountries.put("HU", "Hungary");
            mCountries.put("IS", "Iceland");
            mCountries.put("IN", "India");
            mCountries.put("ID", "Indonesia");
            mCountries.put("IR", "Iran");
            mCountries.put("IQ", "Iraq");
            mCountries.put("IE", "Ireland");
            mCountries.put("IM", "Isle Of Man");
            mCountries.put("IL", "Israel");
            mCountries.put("IT", "Italy");
            mCountries.put("JM", "Jamaica");
            mCountries.put("JP", "Japan");
            mCountries.put("JE", "Jersey");
            mCountries.put("JO", "Jordan");
            mCountries.put("KZ", "Kazakhstan");
            mCountries.put("KE", "Kenya");
            mCountries.put("KI", "Kiribati");
            mCountries.put("KR", "North Korea");
            mCountries.put("KW", "Kuwait");
            mCountries.put("KG", "Kyrgyzstan");
            mCountries.put("LA", "Laos");
            mCountries.put("LV", "Latvia");
            mCountries.put("LB", "Lebanon");
            mCountries.put("LS", "Lesotho");
            mCountries.put("LR", "Liberia");
            mCountries.put("LI", "Liechtenstein");
            mCountries.put("LT", "Lithuania");
            mCountries.put("LU", "Luxembourg");
            mCountries.put("MO", "Macao");
            mCountries.put("MK", "Macedonia");
            mCountries.put("MG", "Madagascar");
            mCountries.put("MW", "Malawi");
            mCountries.put("MY", "Malaysia");
            mCountries.put("MV", "Maldives");
            mCountries.put("ML", "Mali");
            mCountries.put("MT", "Malta");
            mCountries.put("MH", "Marshall Islands");
            mCountries.put("MQ", "Martinique");
            mCountries.put("MR", "Mauritania");
            mCountries.put("MU", "Mauritius");
            mCountries.put("YT", "Mayotte");
            mCountries.put("MX", "Mexico");
            mCountries.put("FM", "Micronesia");
            mCountries.put("MD", "Moldova");
            mCountries.put("MC", "Monaco");
            mCountries.put("MN", "Mongolia");
            mCountries.put("ME", "Montenegro");
            mCountries.put("MS", "Montserrat");
            mCountries.put("MA", "Morocco");
            mCountries.put("MZ", "Mozambique");
            mCountries.put("MM", "Myanmar");
            mCountries.put("NA", "Namibia");
            mCountries.put("NR", "Nauru");
            mCountries.put("NP", "Nepal");
            mCountries.put("NL", "Netherlands");
            mCountries.put("AN", "Netherlands Antilles");
            mCountries.put("NC", "New Caledonia");
            mCountries.put("NZ", "New Zealand");
            mCountries.put("NI", "Nicaragua");
            mCountries.put("NE", "Niger");
            mCountries.put("NG", "Nigeria");
            mCountries.put("NU", "Niue");
            mCountries.put("NF", "Norfolk Island");
            mCountries.put("MP", "Northern Mariana Islands");
            mCountries.put("NO", "Norway");
            mCountries.put("OM", "Oman");
            mCountries.put("PK", "Pakistan");
            mCountries.put("PW", "Palau");
            mCountries.put("PA", "Panama");
            mCountries.put("PG", "Papua New Guinea");
            mCountries.put("PY", "Paraguay");
            mCountries.put("PE", "Peru");
            mCountries.put("PH", "Philippines");
            mCountries.put("PN", "Pitcairn");
            mCountries.put("PL", "Poland");
            mCountries.put("PT", "Portugal");
            mCountries.put("PR", "Puerto Rico");
            mCountries.put("QA", "Qatar");
            mCountries.put("RE", "Reunion");
            mCountries.put("RO", "Romania");
            mCountries.put("RU", "Russian Federation");
            mCountries.put("RW", "Rwanda");
            mCountries.put("BL", "Saint Barthelemy");
            mCountries.put("SH", "Saint Helena");
            mCountries.put("KN", "Saint Kitts And Nevis");
            mCountries.put("LC", "Saint Lucia");
            mCountries.put("MF", "Saint Martin");
            mCountries.put("PM", "Saint Pierre And Miquelon");
            mCountries.put("VC", "Saint Vincent And Grenadines");
            mCountries.put("WS", "Samoa");
            mCountries.put("SM", "San Marino");
            mCountries.put("ST", "Sao Tome And Principe");
            mCountries.put("SA", "Saudi Arabia");
            mCountries.put("SN", "Senegal");
            mCountries.put("RS", "Serbia");
            mCountries.put("SC", "Seychelles");
            mCountries.put("SL", "Sierra Leone");
            mCountries.put("SG", "Singapore");
            mCountries.put("SK", "Slovakia");
            mCountries.put("SI", "Slovenia");
            mCountries.put("SB", "Solomon Islands");
            mCountries.put("SO", "Somalia");
            mCountries.put("ZA", "South Africa");
            mCountries.put("GS", "South Georgia And Sandwich Isl.");
            mCountries.put("ES", "Spain");
            mCountries.put("LK", "Sri Lanka");
            mCountries.put("SD", "Sudan");
            mCountries.put("SR", "Suriname");
            mCountries.put("SJ", "Svalbard And Jan Mayen");
            mCountries.put("SZ", "Swaziland");
            mCountries.put("SE", "Sweden");
            mCountries.put("CH", "Switzerland");
            mCountries.put("SY", "Syrian Arab Republic");
            mCountries.put("TW", "Taiwan");
            mCountries.put("TJ", "Tajikistan");
            mCountries.put("TZ", "Tanzania");
            mCountries.put("TH", "Thailand");
            mCountries.put("TL", "Timor-Leste");
            mCountries.put("TG", "Togo");
            mCountries.put("TK", "Tokelau");
            mCountries.put("TO", "Tonga");
            mCountries.put("TT", "Trinidad And Tobago");
            mCountries.put("TN", "Tunisia");
            mCountries.put("TR", "Turkey");
            mCountries.put("TM", "Turkmenistan");
            mCountries.put("TC", "Turks And Caicos Islands");
            mCountries.put("TV", "Tuvalu");
            mCountries.put("UG", "Uganda");
            mCountries.put("UA", "Ukraine");
            mCountries.put("AE", "United Arab Emirates");
            mCountries.put("GB", "United Kingdom");
            mCountries.put("US", "United States");
            mCountries.put("UM", "United States Outlying Islands");
            mCountries.put("UY", "Uruguay");
            mCountries.put("UZ", "Uzbekistan");
            mCountries.put("VU", "Vanuatu");
            mCountries.put("VE", "Venezuela");
            mCountries.put("VN", "VietNam");
            mCountries.put("VG", "Virgin Islands, British");
            mCountries.put("VI", "Virgin Islands, U.S.");
            mCountries.put("WF", "Wallis And Futuna");
            mCountries.put("EH", "Western Sahara");
            mCountries.put("YE", "Yemen");
            mCountries.put("ZM", "Zambia");
            mCountries.put("ZW", "Zimbabwe");
            return mCountries;
        }
    }

    public ArrayList<String> getAllCountries() {
        ArrayList<String> countries = new ArrayList<>();
        HashMap<String,String> map = MapAllCountries();
        for (Map.Entry<String,String> entry : map.entrySet()) {
            countries.add(entry.getValue());
        }
        Collections.sort(countries);
        return countries;
    }
}

package org.example.model;
import javax.persistence.MappedSuperclass;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@MappedSuperclass
public class Info {
    private String regNum;
    private String code;
    private String divisionParentName;
    private String divisionParentCode;
    private String ogrn;
    private String fullName;
    private String shortName;
    private String inn;
    private String kpp;
    private String regDate;
    private String okopfName;
    private String okopfCode;
    private String postIndex;
    private String cityType;
    private String cityName;
    private String streetType;
    private String streetName;
    private String house;
    private String oktmoName;
    private String oktmoCode;
    private String orfkName;
    private String orfkCode;
    private String oksmName;
    private String oksmCode;
    private String location;
    private String kbkName;
    private String kbkCode;
    private String okoguName;
    private String okoguCode;
    private String okpoCode;
    private String orgTypeName;
    private String orgTypeCode;
    private String establishmentKindName;
    private String establishmentKindCode;
    private String legalPersonKindName;
    private String legalPersonKindCode;
    private String ougvName;
    private String ougvCode;
    private String uoName;
    private String uoCode;
    private String creatorKindName;
    private String creatorKindCode;
    private String creatorPlaceName;
    private String creatorPlaceCode;
    private String founderKindName;
    private String founderKindCode;
    private String founderPlaceName;
    private String founderPlaceCode;
    private String budgetLvlName;
    private String budgetLvlCode;
    private String budgetName;
    private String budgetCode;
    private String statusCode;
    private String statusName;
    private String regionType;
    private String regionName;
    private String isOGV;
    private String isObosob;
    private String orgStatus;
    private String recordNum;
    private String parentCode;
    private String parentName;
    private String okatoCode;
    private String okatoName;
    private String guid;
    private String status;
    private String controlNum;
    private String bidNum;
    private String firstRegDate;
    private String firstRegGuid;
    private String lastRegGuid;
    private String lastRegDate;
    private String lastRegNum;
    private String updateReason;
    private String updateNum;
    private String inclusionDate;
    private String exclusionDate;
    private String pubpCode;
    private String rubpCode;
    private String nubpCode;
    private String cpzCode;
    private String pgmyCode;
    private String firmName;
    private String kofkCode;
    private String nameDocs;
    private String accMgmt;
    private String naibznachuch;
    private String regionCode;
    private String areaCode;
    private String areaType;
    private String areaName;
    private String cityCode;
    private String localCode;
    private String localName;
    private String localType;
    private String streetCode;
    private String building;
    private String apartment;
    private String reformationDocument;
    private String reformationDocumentNum;
    private String reformationDocumentDate;
    private String reformationName;
    private String reformationCode;
    private String reformationStartDate;
    private String reformationEndDate;
    private String dateUpdate;
    private String isExcluded;
    private String isReorg;
    private String startDate;
    private String endDate;
    private String loadDate;
    private String regionKladrCode;
    private String egrulnotincluded;
    private String parentrecordnum;
    private String planningstructuretype;
    private String planningstructurename;
    private String contourTypeCode;
    private String specEventCode;
    private String speceventcodedop1;
    private String speceventcodedop2;
    private String speceventcodedop3;
    private String dsp;
    private String ppotypecode;
    private String ppotypename;
    private String reforfkCode;
    private String isUch;


    public String getRegNum() { return regNum; }
    public void setRegNum(String regNum) { this.regNum = regNum; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getDivisionParentName() {
        return divisionParentName;
    }

    public void setDivisionParentName(String divisionParentName) {
        this.divisionParentName = divisionParentName;
    }

    public String getDivisionParentCode() {
        return divisionParentCode;
    }

    public void setDivisionParentCode(String divisionParentCode) {
        this.divisionParentCode = divisionParentCode;
    }

    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getOkopfName() {
        return okopfName;
    }

    public void setOkopfName(String okopfName) {
        this.okopfName = okopfName;
    }

    public String getOkopfCode() {
        return okopfCode;
    }

    public void setOkopfCode(String okopfCode) {
        this.okopfCode = okopfCode;
    }

    public String getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(String postIndex) {
        this.postIndex = postIndex;
    }

    public String getCityType() {
        return cityType;
    }

    public void setCityType(String cityType) {
        this.cityType = cityType;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStreetType() {
        return streetType;
    }

    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getOktmoName() {
        return oktmoName;
    }

    public void setOktmoName(String oktmoName) {
        this.oktmoName = oktmoName;
    }

    public String getOktmoCode() {
        return oktmoCode;
    }

    public void setOktmoCode(String oktmoCode) {
        this.oktmoCode = oktmoCode;
    }

    public String getOrfkName() {
        return orfkName;
    }

    public void setOrfkName(String orfkName) {
        this.orfkName = orfkName;
    }

    public String getOrfkCode() {
        return orfkCode;
    }

    public void setOrfkCode(String orfkCode) {
        this.orfkCode = orfkCode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getKbkName() {
        return kbkName;
    }

    public void setKbkName(String kbkName) {
        this.kbkName = kbkName;
    }

    public String getKbkCode() {
        return kbkCode;
    }

    public void setKbkCode(String kbkCode) {
        this.kbkCode = kbkCode;
    }

    public String getOkoguName() {
        return okoguName;
    }

    public void setOkoguName(String okoguName) {
        this.okoguName = okoguName;
    }

    public String getOkoguCode() {
        return okoguCode;
    }

    public void setOkoguCode(String okoguCode) {
        this.okoguCode = okoguCode;
    }

    public String getOkpoCode() {
        return okpoCode;
    }

    public void setOkpoCode(String okpoCode) {
        this.okpoCode = okpoCode;
    }

    public String getOrgTypeName() {
        return orgTypeName;
    }

    public void setOrgTypeName(String orgTypeName) {
        this.orgTypeName = orgTypeName;
    }

    public String getOrgTypeCode() {
        return orgTypeCode;
    }

    public void setOrgTypeCode(String orgTypeCode) {
        this.orgTypeCode = orgTypeCode;
    }

    public String getEstablishmentKindName() {
        return establishmentKindName;
    }

    public void setEstablishmentKindName(String establishmentKindName) {
        this.establishmentKindName = establishmentKindName;
    }

    public String getEstablishmentKindCode() {
        return establishmentKindCode;
    }

    public void setEstablishmentKindCode(String establishmentKindCode) {
        this.establishmentKindCode = establishmentKindCode;
    }

    public String getLegalPersonKindName() {
        return legalPersonKindName;
    }

    public void setLegalPersonKindName(String legalPersonKindName) {
        this.legalPersonKindName = legalPersonKindName;
    }

    public String getLegalPersonKindCode() {
        return legalPersonKindCode;
    }

    public void setLegalPersonKindCode(String legalPersonKindCode) {
        this.legalPersonKindCode = legalPersonKindCode;
    }

    public String getOugvName() {
        return ougvName;
    }

    public void setOugvName(String ougvName) {
        this.ougvName = ougvName;
    }

    public String getOugvCode() {
        return ougvCode;
    }

    public void setOugvCode(String ougvCode) {
        this.ougvCode = ougvCode;
    }

    public String getUoName() {
        return uoName;
    }

    public void setUoName(String uoName) {
        this.uoName = uoName;
    }

    public String getUoCode() {
        return uoCode;
    }

    public void setUoCode(String uoCode) {
        this.uoCode = uoCode;
    }

    public String getCreatorKindName() {
        return creatorKindName;
    }

    public void setCreatorKindName(String creatorKindName) {
        this.creatorKindName = creatorKindName;
    }

    public String getCreatorKindCode() {
        return creatorKindCode;
    }

    public void setCreatorKindCode(String creatorKindCode) {
        this.creatorKindCode = creatorKindCode;
    }

    public String getCreatorPlaceName() {
        return creatorPlaceName;
    }

    public void setCreatorPlaceName(String creatorPlaceName) {
        this.creatorPlaceName = creatorPlaceName;
    }

    public String getCreatorPlaceCode() {
        return creatorPlaceCode;
    }

    public void setCreatorPlaceCode(String creatorPlaceCode) {
        this.creatorPlaceCode = creatorPlaceCode;
    }

    public String getFounderKindName() {
        return founderKindName;
    }

    public void setFounderKindName(String founderKindName) {
        this.founderKindName = founderKindName;
    }

    public String getFounderKindCode() {
        return founderKindCode;
    }

    public void setFounderKindCode(String founderKindCode) {
        this.founderKindCode = founderKindCode;
    }

    public String getFounderPlaceName() {
        return founderPlaceName;
    }

    public void setFounderPlaceName(String founderPlaceName) {
        this.founderPlaceName = founderPlaceName;
    }

    public String getFounderPlaceCode() {
        return founderPlaceCode;
    }

    public void setFounderPlaceCode(String founderPlaceCode) {
        this.founderPlaceCode = founderPlaceCode;
    }

    public String getBudgetLvlName() {
        return budgetLvlName;
    }

    public void setBudgetLvlName(String budgetLvlName) {
        this.budgetLvlName = budgetLvlName;
    }

    public String getBudgetLvlCode() {
        return budgetLvlCode;
    }

    public void setBudgetLvlCode(String budgetLvlCode) {
        this.budgetLvlCode = budgetLvlCode;
    }

    public String getBudgetName() {
        return budgetName;
    }

    public void setBudgetName(String budgetName) {
        this.budgetName = budgetName;
    }

    public String getBudgetCode() {
        return budgetCode;
    }

    public void setBudgetCode(String budgetCode) {
        this.budgetCode = budgetCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getRegionType() {
        return regionType;
    }

    public void setRegionType(String regionType) {
        this.regionType = regionType;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getIsOGV() {
        return isOGV;
    }

    public void setIsOGV(String isOGV) {
        this.isOGV = isOGV;
    }

    public String getIsObosob() {
        return isObosob;
    }

    public void setIsObosob(String isObosob) {
        this.isObosob = isObosob;
    }

    public String getOrgStatus() {
        return orgStatus;
    }

    public void setOrgStatus(String orgStatus) {
        this.orgStatus = orgStatus;
    }

    public String getRecordNum() {
        return recordNum;
    }

    public void setRecordNum(String recordNum) {
        this.recordNum = recordNum;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getOkatoCode() {
        return okatoCode;
    }

    public void setOkatoCode(String okatoCode) {
        this.okatoCode = okatoCode;
    }

    public String getOkatoName() {
        return okatoName;
    }

    public void setOkatoName(String okatoName) {
        this.okatoName = okatoName;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getControlNum() {
        return controlNum;
    }

    public void setControlNum(String controlNum) {
        this.controlNum = controlNum;
    }

    public String getBidNum() {
        return bidNum;
    }

    public void setBidNum(String bidNum) {
        this.bidNum = bidNum;
    }

    public String getFirstRegDate() {
        return firstRegDate;
    }

    public void setFirstRegDate(String firstRegDate) {
        this.firstRegDate = firstRegDate;
    }

    public String getFirstRegGuid() {
        return firstRegGuid;
    }

    public void setFirstRegGuid(String firstRegGuid) {
        this.firstRegGuid = firstRegGuid;
    }

    public String getLastRegGuid() {
        return lastRegGuid;
    }

    public void setLastRegGuid(String lastRegGuid) {
        this.lastRegGuid = lastRegGuid;
    }

    public String getLastRegDate() {
        return lastRegDate;
    }

    public void setLastRegDate(String lastRegDate) {
        this.lastRegDate = lastRegDate;
    }

    public String getLastRegNum() {
        return lastRegNum;
    }

    public void setLastRegNum(String lastRegNum) {
        this.lastRegNum = lastRegNum;
    }

    public String getUpdateReason() {
        return updateReason;
    }

    public void setUpdateReason(String updateReason) {
        this.updateReason = updateReason;
    }

    public String getUpdateNum() {
        return updateNum;
    }

    public void setUpdateNum(String updateNum) {
        this.updateNum = updateNum;
    }

    public String getInclusionDate() {
        return inclusionDate;
    }

    public void setInclusionDate(String inclusionDate) {
        this.inclusionDate = inclusionDate;
    }

    public String getExclusionDate() {
        return exclusionDate;
    }

    public void setExclusionDate(String exclusionDate) {
        this.exclusionDate = exclusionDate;
    }

    public String getPubpCode() {
        return pubpCode;
    }

    public void setPubpCode(String pubpCode) {
        this.pubpCode = pubpCode;
    }

    public String getRubpCode() {
        return rubpCode;
    }

    public void setRubpCode(String rubpCode) {
        this.rubpCode = rubpCode;
    }

    public String getNubpCode() {
        return nubpCode;
    }

    public void setNubpCode(String nubpCode) {
        this.nubpCode = nubpCode;
    }

    public String getCpzCode() {
        return cpzCode;
    }

    public void setCpzCode(String cpzCode) {
        this.cpzCode = cpzCode;
    }

    public String getPgmyCode() {
        return pgmyCode;
    }

    public void setPgmyCode(String pgmyCode) {
        this.pgmyCode = pgmyCode;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public String getKofkCode() {
        return kofkCode;
    }

    public void setKofkCode(String kofkCode) {
        this.kofkCode = kofkCode;
    }

    public String getNameDocs() {
        return nameDocs;
    }

    public void setNameDocs(String nameDocs) {
        this.nameDocs = nameDocs;
    }

    public String getAccMgmt() {
        return accMgmt;
    }

    public void setAccMgmt(String accMgmt) {
        this.accMgmt = accMgmt;
    }

    public String getNaibznachuch() {
        return naibznachuch;
    }

    public void setNaibznachuch(String naibznachuch) {
        this.naibznachuch = naibznachuch;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaType() {
        return areaType;
    }

    public void setAreaType(String areaType) {
        this.areaType = areaType;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getLocalCode() {
        return localCode;
    }

    public void setLocalCode(String localCode) {
        this.localCode = localCode;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getLocalType() {
        return localType;
    }

    public void setLocalType(String localType) {
        this.localType = localType;
    }

    public String getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(String streetCode) {
        this.streetCode = streetCode;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getReformationDocument() {
        return reformationDocument;
    }

    public void setReformationDocument(String reformationDocument) {
        this.reformationDocument = reformationDocument;
    }

    public String getReformationDocumentNum() {
        return reformationDocumentNum;
    }

    public void setReformationDocumentNum(String reformationDocumentNum) {
        this.reformationDocumentNum = reformationDocumentNum;
    }

    public String getReformationDocumentDate() {
        return reformationDocumentDate;
    }

    public void setReformationDocumentDate(String reformationDocumentDate) {
        this.reformationDocumentDate = reformationDocumentDate;
    }

    public String getReformationName() {
        return reformationName;
    }

    public void setReformationName(String reformationName) {
        this.reformationName = reformationName;
    }

    public String getReformationCode() {
        return reformationCode;
    }

    public void setReformationCode(String reformationCode) {
        this.reformationCode = reformationCode;
    }

    public String getReformationStartDate() {
        return reformationStartDate;
    }

    public void setReformationStartDate(String reformationStartDate) {
        this.reformationStartDate = reformationStartDate;
    }

    public String getReformationEndDate() {
        return reformationEndDate;
    }

    public void setReformationEndDate(String reformationEndDate) {
        this.reformationEndDate = reformationEndDate;
    }

    public String getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(String dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public String getIsExcluded() {
        return isExcluded;
    }

    public void setIsExcluded(String isExcluded) {
        this.isExcluded = isExcluded;
    }

    public String getIsReorg() {
        return isReorg;
    }

    public void setIsReorg(String isReorg) {
        this.isReorg = isReorg;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getLoadDate() {
        return loadDate;
    }

    public void setLoadDate(String loadDate) {
        this.loadDate = loadDate;
    }

    public String getRegionKladrCode() {
        return regionKladrCode;
    }

    public void setRegionKladrCode(String regionKladrCode) {
        this.regionKladrCode = regionKladrCode;
    }

    public String getEgrulnotincluded() {
        return egrulnotincluded;
    }

    public void setEgrulnotincluded(String egrulnotincluded) {
        this.egrulnotincluded = egrulnotincluded;
    }

    public String getParentrecordnum() {
        return parentrecordnum;
    }

    public void setParentrecordnum(String parentrecordnum) {
        this.parentrecordnum = parentrecordnum;
    }

    public String getPlanningstructuretype() {
        return planningstructuretype;
    }

    public void setPlanningstructuretype(String planningstructuretype) {
        this.planningstructuretype = planningstructuretype;
    }

    public String getPlanningstructurename() {
        return planningstructurename;
    }

    public void setPlanningstructurename(String planningstructurename) {
        this.planningstructurename = planningstructurename;
    }

    public String getContourTypeCode() {
        return contourTypeCode;
    }

    public void setContourTypeCode(String contourTypeCode) {
        this.contourTypeCode = contourTypeCode;
    }

    public String getSpecEventCode() {
        return specEventCode;
    }

    public void setSpecEventCode(String specEventCode) {
        this.specEventCode = specEventCode;
    }

    public String getSpeceventcodedop1() {
        return speceventcodedop1;
    }

    public void setSpeceventcodedop1(String speceventcodedop1) {
        this.speceventcodedop1 = speceventcodedop1;
    }

    public String getSpeceventcodedop2() {
        return speceventcodedop2;
    }

    public void setSpeceventcodedop2(String speceventcodedop2) {
        this.speceventcodedop2 = speceventcodedop2;
    }

    public String getSpeceventcodedop3() {
        return speceventcodedop3;
    }

    public void setSpeceventcodedop3(String speceventcodedop3) {
        this.speceventcodedop3 = speceventcodedop3;
    }

    public String getDsp() {
        return dsp;
    }

    public void setDsp(String dsp) {
        this.dsp = dsp;
    }

    public String getPpotypecode() {
        return ppotypecode;
    }

    public void setPpotypecode(String ppotypecode) {
        this.ppotypecode = ppotypecode;
    }

    public String getPpotypename() {
        return ppotypename;
    }

    public void setPpotypename(String ppotypename) {
        this.ppotypename = ppotypename;
    }

    public String getReforfkCode() {
        return reforfkCode;
    }

    public void setReforfkCode(String reforfkCode) {
        this.reforfkCode = reforfkCode;
    }

    public String getIsUch() {
        return isUch;
    }

    public void setIsUch(String isUch) {
        this.isUch = isUch;
    }

    public String getOksmName() {
        return oksmName;
    }

    public void setOksmName(String oksmName) {
        this.oksmName = oksmName;
    }

    public String getOksmCode() {
        return oksmCode;
    }

    public void setOksmCode(String oksmCode) {
        this.oksmCode = oksmCode;
    }
}

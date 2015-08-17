
package com.github.pabloo99.xmlsoccer.webservice;

import com.github.pabloo99.xmlsoccer.model.xml.GetOddsByFixtureMatchIdResultXML;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getAllOddsByFixtureMatchIdResult"
})
@XmlRootElement(name = "GetAllOddsByFixtureMatchIdResponse")
public class GetAllOddsByFixtureMatchIdResponse {

    @XmlElement(name = "GetAllOddsByFixtureMatchIdResult")
    protected GetAllOddsByFixtureMatchIdResponse.GetAllOddsByFixtureMatchIdResult getAllOddsByFixtureMatchIdResult;

    /**
     * Gets the value of the getAllOddsByFixtureMatchIdResult property.
     *
     * @return
     *     possible object is
     *     {@link GetAllOddsByFixtureMatchIdResponse.GetAllOddsByFixtureMatchIdResult }
     *
     */
    public GetAllOddsByFixtureMatchIdResponse.GetAllOddsByFixtureMatchIdResult getGetAllOddsByFixtureMatchIdResult() {
        return getAllOddsByFixtureMatchIdResult;
    }

    /**
     * Sets the value of the getAllOddsByFixtureMatchIdResult property.
     *
     * @param value
     *     allowed object is
     *     {@link GetAllOddsByFixtureMatchIdResponse.GetAllOddsByFixtureMatchIdResult }
     *
     */
    public void setGetAllOddsByFixtureMatchIdResult(GetAllOddsByFixtureMatchIdResponse.GetAllOddsByFixtureMatchIdResult value) {
        this.getAllOddsByFixtureMatchIdResult = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class GetAllOddsByFixtureMatchIdResult {

        @XmlElementRef(name="XMLSOCCER.COM", type=GetOddsByFixtureMatchIdResultXML.class)
        protected GetOddsByFixtureMatchIdResultXML content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * {@link String }
         * 
         * 
         */
        public GetOddsByFixtureMatchIdResultXML getContent() {
            if (content == null) {
                content = new GetOddsByFixtureMatchIdResultXML();
            }
            return this.content;
        }

    }

}

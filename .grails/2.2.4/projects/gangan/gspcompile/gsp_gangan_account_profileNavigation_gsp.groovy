import com.gangan.social.AccountType
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_account_profileNavigation_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/account/_profileNavigation.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
codecOut.print((params.action == 'dashboard' || params.action == 'userInbox' ? 'active' : ''))
printHtmlPart(1)
codecOut.print(createLink(controller: 'home', action: 'dashboard'))
printHtmlPart(2)
codecOut.print((params.action == 'userDetails' || params.action == 'updateUserDetails' || params.action == 'editUserDetails' || params.action == 'deleteAccount' || params.action == 'deactivateAccount') ? 'active' : '')
printHtmlPart(1)
codecOut.print(createLink(controller: 'home', action: 'userDetails'))
printHtmlPart(3)
codecOut.print((params.action == 'createAddress' || params.action == 'saveAddress' || params.action == 'addressList') ? 'active' : '')
printHtmlPart(1)
codecOut.print(createLink(controller: 'home', action: 'addressList'))
printHtmlPart(4)
codecOut.print(params.action == 'phoneList' || params.action == 'addPhoneNumber' ? 'active' : '')
printHtmlPart(1)
codecOut.print(createLink(controller: 'home', action: 'phoneList'))
printHtmlPart(5)
codecOut.print(params.action == 'createNewPassword' || params.action == 'saveNewPassword' ? 'active' : '')
printHtmlPart(1)
codecOut.print(createLink(controller: 'home', action: 'createNewPassword'))
printHtmlPart(6)
codecOut.print(params.action == 'subscriptionDetails' || params.action == 'createBasicVendor' || params.action == 'updateBasicVendor' || params.action == 'showBasicVendor' ||
            params.action == 'saveBasicVendor' || params.action == 'createPremiumVendor' || params.action == 'showPremiumVendor' || params.action == 'savePremiumVendor' || params.action == 'updatePremiumVendor' ? 'active' : '')
printHtmlPart(1)
codecOut.print(createLink(controller: 'home', action: 'subscriptionDetails'))
printHtmlPart(7)
if(true && (vendor == null)) {
printHtmlPart(8)
}
else {
printHtmlPart(9)
codecOut.print(params.action == 'portFolioDetails' ? 'active' : '')
printHtmlPart(10)
codecOut.print(createLink(controller: 'vendor', action: 'portfolio'))
printHtmlPart(11)
}
printHtmlPart(12)
codecOut.print(params.action == 'paymentDetails' ? 'active' : '')
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}

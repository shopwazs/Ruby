import com.gangan.user.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_admin_user_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/user/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
codecOut.print(hasErrors(bean: userInstance, field: 'username', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("user.username.label"),'default':("Username")],-1)
printHtmlPart(2)
codecOut.print(hasErrors(bean: userInstance, field: 'password', 'error'))
printHtmlPart(3)
invokeTag('message','g',18,['code':("user.password.label"),'default':("Password")],-1)
printHtmlPart(4)
codecOut.print(hasErrors(bean: userInstance, field: 'country', 'error'))
printHtmlPart(5)
invokeTag('message','g',29,['code':("user.country.label"),'default':("Country")],-1)
printHtmlPart(6)
invokeTag('countrySelect','g',33,['name':("country"),'id':("country"),'class':("form-control")],-1)
printHtmlPart(7)
codecOut.print(hasErrors(bean: userInstance, field: 'city', 'error'))
printHtmlPart(8)
invokeTag('message','g',39,['code':("user.city.label"),'default':("City")],-1)
printHtmlPart(9)
codecOut.print(hasErrors(bean: userInstance, field: 'token', 'error'))
printHtmlPart(10)
invokeTag('message','g',49,['code':("user.token.label"),'default':("Token")],-1)
printHtmlPart(11)
codecOut.print(hasErrors(bean: userInstance, field: 'imageName', 'error'))
printHtmlPart(12)
invokeTag('message','g',60,['code':("user.imageName.label"),'default':("Image Name")],-1)
printHtmlPart(13)
codecOut.print(hasErrors(bean: userInstance, field: 'imageContentType', 'error'))
printHtmlPart(14)
invokeTag('message','g',70,['code':("user.imageContentType.label"),'default':("Image Content Type")],-1)
printHtmlPart(15)
codecOut.print(hasErrors(bean: userInstance, field: 'gender', 'error'))
printHtmlPart(16)
invokeTag('message','g',80,['code':("user.gender.label"),'default':("Gender")],-1)
printHtmlPart(17)
invokeTag('checkBox','g',85,['id':("gender"),'name':("gender"),'value':(userInstance?.gender)],-1)
printHtmlPart(7)
codecOut.print(hasErrors(bean: userInstance, field: 'accountExpired', 'error'))
printHtmlPart(18)
invokeTag('message','g',91,['code':("user.accountExpired.label"),'default':("Account Expired")],-1)
printHtmlPart(6)
invokeTag('checkBox','g',95,['name':("accountExpired"),'id':("accountExpired"),'value':(userInstance?.accountExpired)],-1)
printHtmlPart(7)
codecOut.print(hasErrors(bean: userInstance, field: 'accountLocked', 'error'))
printHtmlPart(19)
invokeTag('message','g',101,['code':("user.accountLocked.label"),'default':("Account Locked")],-1)
printHtmlPart(6)
invokeTag('checkBox','g',105,['name':("accountLocked"),'value':(userInstance?.accountLocked),'id':("accountLocked")],-1)
printHtmlPart(7)
codecOut.print(hasErrors(bean: userInstance, field: 'enabled', 'error'))
printHtmlPart(20)
invokeTag('message','g',111,['code':("user.enabled.label"),'default':("Enabled")],-1)
printHtmlPart(6)
invokeTag('checkBox','g',115,['name':("enabled"),'value':(userInstance?.enabled),'id':("enabled")],-1)
printHtmlPart(7)
codecOut.print(hasErrors(bean: userInstance, field: 'hasVerifiedEmail', 'error'))
printHtmlPart(21)
invokeTag('message','g',121,['code':("user.hasVerifiedEmail.label"),'default':("Has Verified Email")],-1)
printHtmlPart(17)
invokeTag('checkBox','g',126,['name':("hasVerifiedEmail"),'value':(userInstance?.hasVerifiedEmail),'id':("hasVerifiedEmail")],-1)
printHtmlPart(7)
codecOut.print(hasErrors(bean: userInstance, field: 'name', 'error'))
printHtmlPart(22)
invokeTag('message','g',132,['code':("user.name.label"),'default':("Name")],-1)
printHtmlPart(23)
codecOut.print(userInstance?.name)
printHtmlPart(24)
codecOut.print(hasErrors(bean: userInstance, field: 'passwordExpired', 'error'))
printHtmlPart(25)
invokeTag('message','g',142,['code':("user.passwordExpired.label"),'default':("Password Expired")],-1)
printHtmlPart(6)
invokeTag('checkBox','g',146,['name':("passwordExpired"),'value':(userInstance?.passwordExpired)],-1)
printHtmlPart(7)
codecOut.print(hasErrors(bean: userInstance, field: 'socialProfileList', 'error'))
printHtmlPart(26)
invokeTag('message','g',152,['code':("user.socialProfileList.label"),'default':("Social Profile List")],-1)
printHtmlPart(27)
for( s in (userInstance?.socialProfileList ) ) {
printHtmlPart(28)
createTagBody(2, {->
codecOut.print(s?.encodeAsHTML())
})
invokeTag('link','g',158,['controller':("socialProfile"),'action':("show"),'id':(s.id)],2)
printHtmlPart(29)
}
printHtmlPart(30)
createTagBody(1, {->
codecOut.print(message(code: 'default.add.label', args: [message(code: 'socialProfile.label', default: 'SocialProfile')]))
})
invokeTag('link','g',162,['controller':("socialProfile"),'action':("create"),'params':(['user.id': userInstance?.id])],1)
printHtmlPart(31)
codecOut.print(hasErrors(bean: userInstance, field: 'userAccounts', 'error'))
printHtmlPart(32)
invokeTag('message','g',170,['code':("user.userAccounts.label"),'default':("User Accounts")],-1)
printHtmlPart(33)
for( u in (userInstance?.userAccounts ) ) {
printHtmlPart(28)
createTagBody(2, {->
codecOut.print(u?.encodeAsHTML())
})
invokeTag('link','g',177,['controller':("userAccount"),'action':("show"),'id':(u.id)],2)
printHtmlPart(29)
}
printHtmlPart(30)
createTagBody(1, {->
codecOut.print(message(code: 'default.add.label', args: [message(code: 'userAccount.label', default: 'UserAccount')]))
})
invokeTag('link','g',181,['controller':("userAccount"),'action':("create"),'params':(['user.id': userInstance?.id])],1)
printHtmlPart(34)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}

import com.gangan.event.Category
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_admin_categorylist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/category/list.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("admin")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("entityName"),'value':(message(code: 'category.label', default: 'Category'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',7,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('render','g',12,['template':("/admin/category/categoryNavigation")],-1)
printHtmlPart(5)
invokeTag('message','g',16,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(6)
if(true && (flash.message)) {
printHtmlPart(7)
codecOut.print(flash.message)
printHtmlPart(8)
}
printHtmlPart(9)
invokeTag('sortableColumn','g',25,['property':("categoryName"),'title':(message(code: 'category.categoryName.label', default: 'Category Name'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',28,['property':("dateCreated"),'title':(message(code: 'category.dateCreated.label', default: 'Date Created'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',31,['property':("lastUpdated"),'title':(message(code: 'category.lastUpdated.label', default: 'Last Updated'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',32,['property':("action"),'title':(message(code: 'category.action.label', default: 'Action'))],-1)
printHtmlPart(12)
loop:{
int i = 0
for( categoryInstance in (categoryInstanceList) ) {
printHtmlPart(13)
codecOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(14)
createTagBody(3, {->
codecOut.print(fieldValue(bean: categoryInstance, field: "categoryName"))
})
invokeTag('link','g',40,['action':("show"),'id':(categoryInstance.id)],3)
printHtmlPart(15)
invokeTag('formatDate','g',42,['date':(categoryInstance.dateCreated)],-1)
printHtmlPart(15)
invokeTag('formatDate','g',44,['date':(categoryInstance.lastUpdated)],-1)
printHtmlPart(16)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',47,['class':("btn btn-xs btn-default"),'controller':("category"),'action':("edit"),'params':([id: categoryInstance?.id])],3)
printHtmlPart(18)
createClosureForHtmlPart(19, 3)
invokeTag('link','g',49,['class':("btn btn-xs btn-danger"),'controller':("category"),'action':("delete"),'params':([id: categoryInstance?.id])],3)
printHtmlPart(20)
i++
}
}
printHtmlPart(21)
invokeTag('paginate','g',58,['total':(categoryInstanceTotal)],-1)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',61,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}

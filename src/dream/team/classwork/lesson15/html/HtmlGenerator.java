package dream.team.classwork.lesson15.html;

import dream.team.classwork.lesson15.html.HtmlTag;

public class HtmlGenerator {
    public static void main(String[] args) {

        String htmlText = "<html>" +
                "<body>" +
                "<div>" +
                "<div>Hello!</div>" +
                "/<div>" +
                "</body>" +
                "</html";

        HtmlTag div = new HtmlTag("div", "hello!");
        HtmlTag div1 = new HtmlTag("div", div);
        HtmlTag body = new HtmlTag("div", div1);
        HtmlTag html = new HtmlTag("div", body);

        System.out.println(generateHtml(div));

    }

    public static String generateHtml(HtmlTag htmlTag) {

        return "<" + htmlTag.name + ">" + htmlTag.text + "/<" + htmlTag.name + ">";

    }
}

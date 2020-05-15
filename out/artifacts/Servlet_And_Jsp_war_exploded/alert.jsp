<html>
<script src="js/sweetalert.min.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<body>

<%
    int type = (Integer) request.getSession().getAttribute("type");
    String alertTitle =(String) request.getSession().getAttribute("title");
    String alertMessage =(String) request.getSession().getAttribute("message");
    switch (type) {
        case 0:
%>
<script >
    $(document).ready(function () {
        swal('<%=alertTitle%>', '<%=alertMessage%>', "error");
    });
</script>
<%
        break;
    case 1:
%>
<script >
    $(document).ready(function () {
        swal('<%=alertTitle%>', '<%=alertMessage%>', "info");
    });
</script>
<%
        break;
    case 2:
%>
<script >
    $(document).ready(function () {
        swal('<%=alertTitle%>', '<%=alertMessage%>', "success");
    });
</script>
<%
            break;
    }
%>

</body>

</html>


document.addEventListener("DOMContentLoaded", function () {
    var rows = document.querySelectorAll("table tr:not(:first-child)");

    rows.forEach(function (row) {
        row.tabIndex = 0;
    });
});

const http = require("http");
const fs = require("fs");
const path = require("path");

const root = __dirname;
const port = 4789;

const types = {
  ".json": "application/json; charset=utf-8",
  ".js": "application/javascript; charset=utf-8",
  ".html": "text/html; charset=utf-8",
  ".svg": "image/svg+xml; charset=utf-8"
};

http.createServer((req, res) => {
  const corsHeaders = {
    "Access-Control-Allow-Origin": "*",
    "Access-Control-Allow-Methods": "GET, OPTIONS",
    "Access-Control-Allow-Headers": "Content-Type",
    "Access-Control-Allow-Private-Network": "true",
    "Cache-Control": "no-store"
  };

  if (req.method === "OPTIONS") {
    res.writeHead(204, corsHeaders);
    res.end();
    return;
  }

  const requested = req.url === "/" ? "/manifest.json" : req.url.split("?")[0];
  const file = path.normalize(path.join(root, requested));

  if (!file.startsWith(root)) {
    res.writeHead(403);
    res.end("Forbidden");
    return;
  }

  fs.readFile(file, (err, data) => {
    if (err) {
      res.writeHead(404);
      res.end("Not found");
      return;
    }

    res.writeHead(200, {
      "Content-Type": types[path.extname(file)] || "application/octet-stream",
      ...corsHeaders
    });
    res.end(data);
  });
}).listen(port, "127.0.0.1", () => {
  console.log(`Penpot plugin server listening on http://127.0.0.1:${port}/manifest.json`);
});

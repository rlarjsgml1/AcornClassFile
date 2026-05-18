(function () {
  penpot.ui.open("Used Car Site Generator v2", "<div style='font-family:sans-serif;padding:16px;color:#111827'><strong>v2 생성 완료</strong><p>텍스트와 버튼을 크게 보강한 보드를 추가합니다.</p></div>", {
    width: 360,
    height: 150
  });

  const C = {
    bg: "#F7F3EA",
    surface: "#FFFFFF",
    navy: "#0B1F3A",
    blue: "#1F6FEB",
    blueSoft: "#E8F1FF",
    green: "#0E8F68",
    greenSoft: "#E6F7F1",
    amber: "#D98A12",
    amberSoft: "#FFF3D9",
    text: "#172033",
    muted: "#64748B",
    line: "#DDE5E8",
    black: "#111827"
  };

  function board(name, x, y, w, h, fill) {
    const b = penpot.createBoard();
    b.name = name;
    b.x = x;
    b.y = y;
    b.resize(w, h);
    b.fills = [{ fillColor: fill, fillOpacity: 1 }];
    return b;
  }

  function rect(parent, name, x, y, w, h, fill, radius, stroke) {
    const s = penpot.createRectangle();
    s.name = name;
    s.x = parent.x + x;
    s.y = parent.y + y;
    s.resize(w, h);
    s.fills = fill ? [{ fillColor: fill, fillOpacity: 1 }] : [];
    s.borderRadius = radius || 0;
    if (stroke) {
      s.strokes = [{ strokeColor: stroke, strokeOpacity: 1, strokeStyle: "solid", strokeWidth: 1, strokeAlignment: "center" }];
    }
    parent.appendChild(s);
    return s;
  }

  function label(parent, name, value, x, y, w, size, weight, color, align) {
    const t = penpot.createText(value);
    if (!t) return null;
    t.name = name;
    t.x = parent.x + x;
    t.y = parent.y + y;
    t.resize(w, Math.max(size * 1.6, 32));
    t.growType = "auto-height";
    t.fontSize = size;
    t.fontWeight = weight || "400";
    t.lineHeight = Math.round(size * 1.35);
    t.fills = [{ fillColor: color || C.text, fillOpacity: 1 }];
    if (align) t.align = align;
    parent.appendChild(t);
    return t;
  }

  function button(parent, name, text, x, y, w, h, fill, textColor) {
    rect(parent, "Button Shape / " + name, x, y, w, h, fill, Math.round(h / 2));
    label(parent, "Button Text / " + name, text, x, y + Math.round((h - 22) / 2), w, 18, "900", textColor || C.surface, "center");
  }

  function chip(parent, text, x, y, fill, color, w) {
    const width = w || Math.max(96, text.length * 17 + 34);
    rect(parent, "Filter Chip / " + text, x, y, width, 44, fill, 22, null);
    label(parent, "Filter Chip Text / " + text, text, x, y + 11, width, 16, "900", color, "center");
    return width;
  }

  function input(parent, title, value, x, y, w) {
    rect(parent, "Input Box / " + title, x, y, w, 78, C.surface, 20, C.line);
    label(parent, "Input Label / " + title, title, x + 22, y + 12, w - 44, 15, "800", C.muted);
    label(parent, "Input Value / " + title, value, x + 22, y + 38, w - 44, 22, "900", C.text);
  }

  function smallCar(parent, x, y, w, body) {
    rect(parent, "Car Body", x + 20, y + 72, w - 40, 72, body, 26);
    rect(parent, "Car Window", x + 105, y + 34, w - 210, 58, "#DCE9F1", 20);
    rect(parent, "Car Light Left", x + 40, y + 98, 44, 18, "#FFE4A3", 9);
    rect(parent, "Car Light Right", x + w - 84, y + 98, 44, 18, "#FFE4A3", 9);
    const wheel1 = penpot.createEllipse();
    wheel1.name = "Car Wheel Left";
    wheel1.x = parent.x + x + 86;
    wheel1.y = parent.y + y + 126;
    wheel1.resize(54, 54);
    wheel1.fills = [{ fillColor: C.black, fillOpacity: 1 }];
    parent.appendChild(wheel1);
    const wheel2 = wheel1.clone();
    wheel2.name = "Car Wheel Right";
    wheel2.x = parent.x + x + w - 140;
    parent.appendChild(wheel2);
  }

  function stat(parent, title, value, x, y, w) {
    rect(parent, "Stat Card / " + title, x, y, w, 98, C.surface, 22, C.line);
    label(parent, "Stat Title / " + title, title, x + 22, y + 18, w - 44, 16, "800", C.muted);
    label(parent, "Stat Value / " + title, value, x + 22, y + 48, w - 44, 24, "900", C.text);
  }

  function vehicle(parent, n, title, spec, price, total, x, y, w, carColor, badge) {
    rect(parent, "Vehicle Card v2 / " + n, x, y, w, 270, C.surface, 30, C.line);
    rect(parent, "Vehicle Photo Area / " + n, x + 24, y + 24, 300, 222, "#E6EEF2", 24, null);
    smallCar(parent, x + 38, y + 50, 272, carColor);
    chip(parent, "실사진 인증", x + 44, y + 40, C.greenSoft, C.green, 120);
    chip(parent, badge, x + 176, y + 40, C.blueSoft, C.blue, 100);
    label(parent, "Vehicle Title v2 / " + n, title, x + 356, y + 32, 420, 28, "900", C.text);
    label(parent, "Vehicle Spec v2 / " + n, spec, x + 356, y + 80, 460, 18, "700", C.muted);
    chip(parent, "진단완료", x + 356, y + 124, C.greenSoft, C.green, 108);
    chip(parent, "무사고", x + 476, y + 124, C.greenSoft, C.green, 96);
    chip(parent, "총비용 공개", x + 584, y + 124, C.blueSoft, C.blue, 128);
    label(parent, "Vehicle Trust Copy / " + n, "성능점검표, 보험이력, 촬영일을 상세 페이지에서 바로 확인", x + 356, y + 190, 500, 18, "700", C.text);
    rect(parent, "Vehicle Price Panel / " + n, x + w - 280, y + 24, 252, 222, "#F8FAFC", 24, C.line);
    label(parent, "Price Label / " + n, "차량가", x + w - 250, y + 48, 180, 16, "800", C.muted);
    label(parent, "Price Value / " + n, price, x + w - 250, y + 76, 190, 30, "900", C.text);
    label(parent, "Total Label / " + n, "예상 총비용", x + w - 250, y + 122, 180, 16, "900", C.blue);
    label(parent, "Total Value / " + n, total, x + w - 250, y + 150, 190, 28, "900", C.blue);
    button(parent, "Visit Reservation " + n, "방문예약", x + w - 250, y + 196, 116, 44, C.navy, C.surface);
    button(parent, "Favorite " + n, "찜하기", x + w - 124, y + 196, 96, 44, C.surface, C.text);
  }

  const d = board("중고차 매매 사이트 - Desktop v2 텍스트/버튼 강화", 0, 0, 1440, 1850, C.bg);
  rect(d, "Desktop Header Background", 0, 0, 1440, 96, C.surface, 0, C.line);
  label(d, "Header Logo Text", "AUTO TRUST", 88, 30, 180, 28, "900", C.navy);
  label(d, "Header Nav Text", "중고차 검색     인증차     내차 팔기     비교함     찜한 차량", 342, 36, 620, 18, "800", C.muted);
  button(d, "Header Consult CTA", "상담하기", 1190, 24, 160, 52, C.navy, C.surface);

  rect(d, "Hero Main Area", 72, 132, 1296, 478, C.navy, 42, null);
  label(d, "Hero Eyebrow Text", "2026 VERIFIED USED CAR MARKET", 124, 186, 500, 18, "900", "#8ED8C1");
  label(d, "Hero Main Title", "실매물과 총비용까지\n한 번에 확인하는 중고차 검색", 124, 230, 650, 54, "900", C.surface);
  label(d, "Hero Description", "검색 -> 목록 -> 상세 -> 진단/이력 확인 -> 문의/방문예약 흐름을 명확한 버튼과 텍스트로 설계했습니다.", 124, 368, 740, 22, "700", "#C8D6E5");
  rect(d, "Hero Search Card", 124, 430, 780, 130, "#F8FAFC", 30, null);
  input(d, "제조사/모델", "현대 그랜저", 150, 456, 220);
  input(d, "예산", "2,000만~3,500만원", 386, 456, 250);
  input(d, "지역", "서울/경기", 652, 456, 150);
  button(d, "Hero Search Button", "검색하기", 816, 456, 72, 78, C.blue, C.surface);
  rect(d, "Hero Car Showcase", 958, 178, 340, 280, "#F4F8FA", 36, null);
  smallCar(d, 988, 238, 280, C.blue);
  stat(d, "예상 총비용", "3,184만원", 990, 470, 270);
  chip(d, "실매물 확인", 1120, 498, C.greenSoft, C.green, 132);

  rect(d, "Quick Filter Bar", 72, 650, 1296, 92, C.surface, 30, C.line);
  chip(d, "무사고", 112, 674, C.greenSoft, C.green, 104);
  chip(d, "인증중고", 232, 674, C.blueSoft, C.blue, 120);
  chip(d, "오늘 방문 가능", 368, 674, C.amberSoft, C.amber, 152);
  chip(d, "총비용 공개", 536, 674, C.blueSoft, C.blue, 140);
  button(d, "Open Filter Button", "필터 열기", 1160, 670, 150, 52, C.navy, C.surface);

  label(d, "Section Heading", "검색 결과와 필터를 한 화면에서 확인", 72, 806, 740, 38, "900", C.text);
  label(d, "Section Subcopy", "차량 카드마다 버튼, 배지, 가격, 예상 총비용이 크게 보이도록 다시 구성했습니다.", 72, 860, 820, 21, "700", C.muted);
  rect(d, "Left Filter Panel v2", 72, 930, 280, 650, C.surface, 30, C.line);
  label(d, "Filter Panel Title", "상세 필터", 104, 966, 180, 28, "900", C.text);
  label(d, "Filter Panel Count", "12,480대 검색 가능", 104, 1008, 190, 18, "900", C.blue);
  input(d, "가격", "2,000만~3,500만원", 104, 1062, 216);
  input(d, "연식", "2020년 이후", 104, 1160, 216);
  input(d, "주행거리", "60,000km 이하", 104, 1258, 216);
  chip(d, "무사고", 104, 1372, C.greenSoft, C.green, 100);
  chip(d, "진단완료", 214, 1372, C.greenSoft, C.green, 112);
  button(d, "Filter Apply Button", "조건 적용", 104, 1488, 216, 56, C.blue, C.surface);

  rect(d, "Results Summary Bar", 384, 930, 984, 94, C.surface, 28, C.line);
  label(d, "Results Count Text", "총 12,480대", 420, 960, 200, 28, "900", C.text);
  chip(d, "현대", 620, 956, C.blueSoft, C.blue, 84);
  chip(d, "무사고", 716, 956, C.greenSoft, C.green, 104);
  chip(d, "총비용 공개", 832, 956, C.blueSoft, C.blue, 136);
  button(d, "Sort Button", "낮은 총비용순", 1158, 950, 170, 52, C.surface, C.text);
  vehicle(d, 1, "현대 그랜저 IG 2.5 프리미엄", "2021년 · 42,000km · 가솔린 · 경기 성남", "2,880만원", "3,184만원", 384, 1056, 984, C.blue, "무사고");
  vehicle(d, 2, "기아 쏘렌토 MQ4 디젤 2WD", "2022년 · 35,000km · 디젤 · 인천", "3,260만원", "3,612만원", 384, 1350, 984, C.green, "보증가능");
  rect(d, "Compare Sticky Bar", 384, 1668, 984, 104, C.navy, 30, null);
  label(d, "Compare Sticky Text", "찜한 차량 2대 비교 중", 424, 1700, 340, 28, "900", C.surface);
  label(d, "Compare Sticky Desc", "가격, 연식, 주행거리, 사고 이력, 예상 총비용을 비교합니다.", 424, 1738, 560, 18, "700", "#C8D6E5");
  button(d, "Compare CTA Button", "비교표 보기", 1156, 1692, 160, 56, C.green, C.surface);

  const m = board("중고차 매매 사이트 - Mobile v2 텍스트/버튼 강화", 1510, 0, 390, 1420, C.bg);
  rect(m, "Mobile Header", 0, 0, 390, 78, C.surface, 0, C.line);
  label(m, "Mobile Logo", "AUTO TRUST", 22, 24, 140, 20, "900", C.navy);
  button(m, "Mobile Menu Button", "메뉴", 304, 18, 64, 42, C.navy, C.surface);
  rect(m, "Mobile Hero", 18, 100, 354, 330, C.navy, 32, null);
  label(m, "Mobile Hero Title", "믿을 수 있는\n중고차를 빠르게", 42, 138, 280, 36, "900", C.surface);
  label(m, "Mobile Hero Copy", "실매물, 진단, 총비용을 카드에서 바로 확인", 42, 236, 286, 18, "700", "#C8D6E5");
  rect(m, "Mobile Search Input", 42, 286, 220, 58, C.surface, 18, null);
  label(m, "Mobile Search Placeholder", "제조사, 모델 검색", 60, 304, 170, 18, "900", C.text);
  button(m, "Mobile Search Button", "검색", 270, 286, 78, 58, C.blue, C.surface);
  chip(m, "무사고", 42, 364, C.greenSoft, C.green, 88);
  chip(m, "총비용", 140, 364, C.blueSoft, C.blue, 88);
  chip(m, "방문가능", 238, 364, C.amberSoft, C.amber, 100);

  rect(m, "Mobile Result Header", 18, 462, 354, 104, C.surface, 28, C.line);
  label(m, "Mobile Result Count", "12,480대 검색됨", 40, 490, 190, 24, "900", C.text);
  button(m, "Mobile Filter Button", "필터", 272, 488, 76, 48, C.navy, C.surface);
  chip(m, "현대", 40, 532, C.blueSoft, C.blue, 76);
  chip(m, "무사고", 126, 532, C.greenSoft, C.green, 88);
  rect(m, "Mobile Vehicle Card 1", 18, 598, 354, 360, C.surface, 30, C.line);
  rect(m, "Mobile Photo 1", 38, 618, 314, 138, "#E6EEF2", 24, null);
  smallCar(m, 60, 634, 260, C.blue);
  label(m, "Mobile Car Title 1", "현대 그랜저 IG", 38, 782, 280, 24, "900", C.text);
  label(m, "Mobile Car Spec 1", "2021년 · 42,000km · 경기 성남", 38, 816, 280, 17, "700", C.muted);
  chip(m, "진단완료", 38, 850, C.greenSoft, C.green, 104);
  chip(m, "총비용 공개", 152, 850, C.blueSoft, C.blue, 126);
  label(m, "Mobile Total Price 1", "예상 총비용 3,184만원", 38, 910, 210, 22, "900", C.blue);
  button(m, "Mobile Visit Button 1", "방문예약", 246, 896, 106, 50, C.navy, C.surface);
  rect(m, "Mobile Bottom CTA", 18, 1294, 354, 68, C.navy, 34, null);
  label(m, "Mobile Bottom CTA Text", "전화 · 채팅 · 시승예약", 70, 1316, 250, 20, "900", C.surface, "center");
})();

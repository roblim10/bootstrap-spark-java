package com.handshake.interviews.alarms;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

import com.google.common.collect.Maps;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.template.velocity.VelocityTemplateEngine;

public class AlarmsController {
	private static AlarmsDao alarmDao = new AlarmsDao();
	
	public static Route serveIndexPage = (Request request, Response response) -> {
		Collection<Alarm> alarms = alarmDao.fetchAllAlarms();
		Map<String, Object> model = Maps.newHashMap();
		model.put("alarms", alarms);
		return new VelocityTemplateEngine().render(
				new ModelAndView(model, "velocity/alarms.vm"));
	};
}
